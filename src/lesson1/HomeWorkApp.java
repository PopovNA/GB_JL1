package lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {

        int a = (int) (Math.random() * 100 - 50);
        int b = (int) (Math.random() * 100 - 50);

        /* тут неплохо бы и сами числа вывести, а то непонятно сумма чего
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b); */
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {

        int value = (int) (Math.random() * 300 - 100);

        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        } else { //вставлять проверку на > 100 сюда, избыточно
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {

        int a = (int) (Math.random() * 100 - 50);
        int b = (int) (Math.random() * 100 - 50);

        /* тут неплохо бы и сами числа вывести, а то непонятно сумма чего
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b); */
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

}
