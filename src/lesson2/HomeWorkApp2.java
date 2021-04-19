package lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(checkSum10to20((int)(Math.random() * 10), (int)(Math.random() * 10)));
        checkMod((int)(Math.random() * 10 - 5));
        System.out.println(checkModAnti((int)(Math.random() * 10 - 5)));
        printNString("String", (int)(Math.random() * 10 + 1));
        System.out.println(checkFor29Feb((int)(Math.random() * 10000 + 1)));

    }

    public static boolean checkSum10to20(int a, int b){
        if (((a + b) >= 10) && ((a + b) <= 20)){
            return true;
        } else {
            return false;
        }
    }

    public static void checkMod(int a){

        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static boolean checkModAnti(int a){

        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printNString(String s, int n){
        for (int i = 1; i <= n; i++){
            System.out.println(s);
        }
    }

    public static boolean checkFor29Feb(int year){

        if (((year % 4) == 0) && !(((year % 100) == 0) ^ ((year % 400) == 0))){
            return true;
        } else
            return false;

    }
}
