package ru.sbrf.animals;

import ru.sbrf.posibility.EatFood;
import ru.sbrf.posibility.MakingSound;
import ru.sbrf.posibility.Moving;
import ru.sbrf.posibility.Swimmable;

public class Dog implements MakingSound, Moving, EatFood, Swimmable {
    public void speak() {
        System.out.println("Я умею говорить Гав!");
    }

    public void move() {
        System.out.println("Я могу очень быстро бегать!");
    }

    public void eat() {
        System.out.println("Я люблю кушать мясо и кости, человеческие :D");
    }

    public void swim() {
        System.out.println("В отличии от некоторых, я умею плавать!");
    }
}
