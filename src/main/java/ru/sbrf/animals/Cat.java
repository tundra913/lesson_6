package ru.sbrf.animals;

import ru.sbrf.posibility.EatFood;
import ru.sbrf.posibility.MakingSound;
import ru.sbrf.posibility.Moving;
import ru.sbrf.posibility.TreeClimber;

public class Cat implements MakingSound, Moving, EatFood, TreeClimber {
    public void speak() {
        System.out.println("Я умею говорить Мяу!");
    }

    public void move() {
        System.out.println("Я могу двигаться тихо-тихо...");
    }

    public void eat() {
        System.out.println("Я люблю кушать рыбку и корм!");
    }

    public void climb() {
        System.out.println("Я, как никто умею лазать по деревьям!");
    }
}
