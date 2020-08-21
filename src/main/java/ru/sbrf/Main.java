package ru.sbrf;

import ru.sbrf.animals.Cat;
import ru.sbrf.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Что же могут кошки:");
        cat.speak();
        cat.move();
        cat.eat();
        cat.climb();

        System.out.println();

        System.out.println("А вот что могут собаки:");
        dog.speak();
        dog.move();
        dog.eat();
        dog.swim();
    }
}
