package lesson3;

import java.util.Random;

public class HomeWorkApp3 {

    public static Random random = new Random();

    public static int[] fillArrayConst(int len, int initialValue){

        int [] internalArray = new int[len];
        for (int i = 0; i < len; i++) {
            internalArray[i] = initialValue;
        }
        return internalArray; //внутренний :-)

    }

    public static boolean checkHalfSum(int[] intArray){

        int sum1, sum2, sum1pos, sum2pos;
        sum1pos = 0;
        sum2pos = intArray.length - 1;
        sum1 = intArray[sum1pos];
        sum2 = intArray[sum2pos];
        while ((sum2pos - sum1pos) > 1){
            if (sum1 <= sum2){
                sum1pos++;
                sum1 += intArray[sum1pos];
            } else {
                sum2pos--;
                sum2 += intArray[sum2pos];
            }
        }
//        System.out.println("\n" + sum1 + "[" + sum1pos + "] - " + sum2 + "[" + sum2pos + "]");
        return sum1 == sum2;

    }

    public static int[] carouselArray(int[] intArray, int n){
        //можно обойтись одним if без else и двигать в одну сторону,
        // но тогда в половине случаев будет перерасход по операциям
        while (n != 0){
            if (n > 0) {
                int buf = intArray[intArray.length - 1];
                for (int i = intArray.length - 1; i > 0; i--) {
                    intArray[i] = intArray[i - 1];
                }
                intArray[0] = buf;
                n--;
            } else {
                int buf = intArray[0];
                for (int i = 0; i < intArray.length - 1; i++) {
                    intArray[i] = intArray[i + 1];
                }
                intArray[intArray.length - 1] = buf;
                n++;
            }
        }
        return intArray;

    }

    public static void main(String[] args) {

        /**
         * так как во всех задачах про вывод значений и/или результатов ни слова,
         * то вывод их в консоль делался для самопроверки и закоментирован
         */

        int[] array1 = new int[random.nextInt(30) + 1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(2);
            //System.out.print(array1[i]);
            array1[i] = ((array1[i] == 0) ? array1[i] + 1 : array1[i] - 1);
            //System.out.println(array1[i]);
        }

        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            //System.out.print(array2[i] + "|");
        }

        int[] array3 = new int[random.nextInt(30) + 1];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(10);
            //System.out.print(array3[i]);
            array3[i] = ((array3[i] < 6) ? array3[i] * 2 : array3[i]);
            //System.out.println(array3[i]);
        }

        int c = random.nextInt(10) + 1;
        int[][] array4 = new int[c][c];
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[i][array4.length - i - 1] = 1;
        }
//        for (int i = 0; i < array4.length; i++) {
//            for (int j = 0; j < array4[i].length; j++) {
//                System.out.print(array4[i][j]);
//            }
//            System.out.println("");
//        }

        int[] array5 = new int[random.nextInt(30) + 1];
        array5 = fillArrayConst(array5.length, random.nextInt(10));
//        for (int i = 0; i < array5.length; i++) {
//            System.out.println(array5[i]);
//        }

        int[] array6 = new int[random.nextInt(30) + 1];
        // хотя тут и массив из задачи №3 подошел бы
        int minVal = 50;
        int maxVal = 0;
        for (int i = 0; i < array6.length; i++) {
            array6[i] = random.nextInt(50);
//            System.out.print(array6[i] + "|");
            minVal = ((array6[i] < minVal) ? array6[i] : minVal);
            maxVal = ((array6[i] > maxVal) ? array6[i] : maxVal);
        }
//        System.out.print("\n min: " + minVal);
//        System.out.print("\n max: " + maxVal);

        int[] array7 = new int[random.nextInt(10) + 2];
        //+2 потму что на массивах с длиной меньше 2-ух задача не имеет смысла
        for (int i = 0; i < array7.length; i++) {
            array7[i] = random.nextInt(25);
//            System.out.print(array7[i] + "|");
        }
        boolean isHalfSum = checkHalfSum(array7);
//        System.out.println(isHalfSum);

        int[] array8 = new int[random.nextInt(10) + 2];
        //+2 по той же причине что и у задачи №7
        for (int i = 0; i < array8.length; i++) {
            array8[i] = random.nextInt(25);
//            System.out.print(array8[i] + "|");
        }
        int n = random.nextInt(array8.length) - (int) array8.length / 2;
//        System.out.println(" N: " + n);
        array8 = carouselArray(array8, n);
//        for (int i = 0; i < array8.length; i++) {
//            System.out.print(array8[i] + "|");
//        }

    }

}
