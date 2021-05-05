package lesson5;

public class IdGenerator {

    private static int id = 1;

    public static int newId() {
        return id++;
    }

}
