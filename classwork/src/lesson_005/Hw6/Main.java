package lesson_005.Hw6;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Cat cat1 = new Cat ("Вискас");
        Cat cat2 = new Cat ("Беляш");
        Cat cat3 = new Cat ("Шустрый");
        Cat cat4 = new Cat("Макс");

        cat1.run(410);
        cat1.swim(10);
        cat2.run(120);
        cat2.swim(5);
        cat3.run(150);
        cat3.swim(7);
        cat4.run(400);
        cat4.swim(40);

        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Джек");
        Dog dog3 = new Dog("Рич");

        dog1.run(500);
        dog1.swim(10);
        dog2.run(250);
        dog2.swim(40);
        dog3.run(600);
        dog3.swim(50);

        System.out.println();
        System.out.println("Всего участвовало " + Cat.getCatCount() + " котов");
        System.out.println("Всего участвовало " + Dog.getDogCount() + " собак");
        System.out.println("Общее количество животных " + (Cat.getCatCount() + Dog.getDogCount()));

    }
}
