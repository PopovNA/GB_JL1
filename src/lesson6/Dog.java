package lesson6;

import lesson6.model.Animal;

public class Dog extends Animal {

    private int dogAmount;
    private static int amount = 0;

    public Dog(String name){
        super(name, 500, 10);
        this.dogAmount = ++amount;
        System.out.println("Собака №" + this.dogAmount);
    }

}
