package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static char[][] map;
    public static int field_length = 3 + random.nextInt(3);
    public static int mapSizeX = field_length;
    public static int mapSizeY = field_length;
    public static int winLength = 3;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty_field = '_';

    public static void createMap() {

        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_field;
            }
        }

    }

    public static void showMap() {

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");

    }

    public static boolean isDraw() {

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_field) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == empty_field;
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Enter your turn coordinates from 1 before " + mapSizeX + ":");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        map[y][x] = human;

    }

    public static void aiTurn() {
        int x, y;

        /**
         * Вместо случайного выбора, делаем перебор всех вариантов с оценкой "веса" хода.
         * Исключение победа противника, тогда блок!
         * Результат заносим в массив такого же размера, где
         * 0 - ячейка занята,
         * 1000 - блокирующая ячейка для победы противника
         * 10000 - ячейка победного хода
         * 1 - ход возможен, но не ведет ни к победе, ни к проигрышу
         */

        int[][] matrix = new int[mapSizeY][mapSizeX];

        x = y = -1;
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (!isEmptyCell(j, i)) {
                    matrix[i][j] = 0;
                    continue;
                }
                map[i][j] = human;
                if (isWin(human)) {
                    map[i][j] = empty_field;
                    matrix[i][j] = 1000;
                    x = j;
                    y = i;
                    continue;
                }
                map[i][j] = ai;
                if (isWin(ai)) {
                    map[i][j] = empty_field;
                    matrix[i][j] = 10000;
                    x = j;
                    y = i;
                    break;
                }
                map[i][j] = empty_field;
                matrix[i][j] = 1;
            }
            // проверяем, если победный ход найден, то дальше не идем
            if (!(x < 0) && (matrix[y][x] > 1000)) {
                break;
            }
        }
        if (x < 0) {
            x = y = 0;
            for (int i = 0; i < mapSizeY; i++) {
                for (int j = 0; j < mapSizeX; j++) {
                    if (matrix[y][x] < matrix[i][j]) {
                        x = j;
                        y = i;
                    }
                    if (matrix[y][x] > 1000) {
                        break;
                    }
                }
                if (matrix[y][x] > 1000) {
                    break;
                }
            }
        }

        System.out.println("AI turn is [" + (y + 1) + ":" + (x + 1) + "]");
        map[y][x] = ai;

    }

    public static boolean isWin(char player) {
        int count_player = 0;

        for (int i = 0; i <= (map.length - winLength); i++){
            for (int j = 0; j <= (map.length - winLength); j++) {
                for (int y = 0; y < winLength; y++) {
                    count_player = 0;
                    for (int x = 0; x < winLength; x++) {
                        if (map[i + y][j + x] == player) count_player++;
                    }
                    if (count_player == winLength) return true;
                }
                for (int x = 0; x < winLength; x++) {
                    count_player = 0;
                    for (int y = 0; y < winLength; y++) {
                        if (map[i + y][j + x] == player) count_player++;
                    }
                    if (count_player == winLength) return true;
                }
                count_player = 0;
                for (int k = 0; k < winLength; k++) {
                    if (map[i + k][j + k] == player) count_player++;
                }
                if (count_player == winLength) return true;
                count_player = 0;
                for (int k = 0; k < winLength; k++) {
                    if (map[i + k][j - k + winLength - 1] == player) count_player++;
                }
                if (count_player == winLength) return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        if (field_length == 5) winLength++;
        createMap();
        showMap();

        while (true) {
            humanTurn();
            showMap();

            if (isWin(human)) {
                System.out.println("Human win!!!");
                break;
            }

            if (isDraw()) {
                System.out.println("Is Draw!!!");
                break;
            }

            aiTurn();
            showMap();

            if (isWin(ai)) {
                System.out.println("AI win!!!");
                break;
            }

            if (isDraw()) {
                System.out.println("Is Draw!!!");
                break;
            }

        }
        System.out.println("Game over!");

    }

}
