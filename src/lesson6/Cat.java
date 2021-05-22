package lesson6;

import lesson6.model.Animal;

public class Cat extends Animal {

    private int catAmount;
    private static int amount = 0;

    public Cat(String name){
        super(name, 200, 0);
        this.catAmount = ++amount;
        System.out.println("Кот №" + this.catAmount);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают.");
    }
}
