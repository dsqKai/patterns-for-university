package ru.kai.patterns.adapter.model;

public class StreetTheaterSystem {
    private static final StreetTheaterSystem instance = new StreetTheaterSystem();

    public static StreetTheaterSystem getInstance() {
        return instance;
    }

    public void specificMethod() {

    }
}
