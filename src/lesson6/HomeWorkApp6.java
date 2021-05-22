package lesson6;

public class HomeWorkApp6 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Кешка");
        cat1.run(150);
        cat1.swim(1);
        Cat cat2 = new Cat("Рэй");
        cat2.run(250);

        Dog dog1 = new Dog("Тиран");
        dog1.run(500);
        dog1.swim(10);
        Dog dog2 = new Dog("Бобик");
        dog2.run(550);
        dog2.swim(15);
    }
}
