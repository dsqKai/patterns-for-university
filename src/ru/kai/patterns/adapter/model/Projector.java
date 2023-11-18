package ru.kai.patterns.adapter.model;

public class Projector {
    private static final Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }
    public void turnOn() {

    }

    public void turnOff() {

    }

    public void adjustBrightness(int brightnessLevel) {

    }
}
