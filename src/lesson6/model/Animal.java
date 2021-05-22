package lesson6.model;

public abstract class Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    private int animalAmount;

    private static int amount = 0;

    public Animal(String name, int maxRun, int maxSwim){
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.animalAmount = ++amount;
        System.out.println("Животное №" + this.animalAmount);
    }

    public int movement(String action, int distance){
        if (((action == "run") && (distance <= maxRun)) || ((action == "swim") && (distance <= maxSwim))){
            return 0;
        } else {
            if (action == "run") {
                return distance - maxRun;
            } else {
                return distance - maxSwim;
            }
        }
    }

    public void run(int distance) {

        int result = movement("run", distance);

        if (result == 0) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " пробежал " + maxRun + " и остановился отдохнуть.");
        }
    }

    public void swim(int distance) {

        int result = movement("swim", distance);

        if (result == 0) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " проплыл " + maxSwim + " и утонул.");
        }
    }

}
