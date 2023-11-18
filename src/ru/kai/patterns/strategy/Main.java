package ru.kai.patterns.strategy;

import ru.kai.patterns.strategy.*;

public class Main {
    public static void main(String[] args) {
//        FlyStrategy noFlyStategy = () -> System.out.println("я не летаю");

        Duck duck = new DuckBuilder().fly("я не летаю").speak("кря-кря").type("я резиновая утка").build();
        duck.info();
        duck.setFlyStrategy(() -> System.out.println("я полетела"));
        duck.fly();
    }
}