package ru.kai.patterns.adapter;

import ru.kai.patterns.adapter.model.HomeTheaterSystem;
import ru.kai.patterns.adapter.model.StreetTheaterSystem;

public class Client {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        HomeTheaterSystem theaterSystem = HomeTheaterSystem.getInstance();
        StreetTheaterSystem streetTheaterSystem = StreetTheaterSystem.getInstance();
        // 1
        cinema.turnOn(theaterSystem);
        cinema.changeMovie("Beginner");
        cinema.turnOff();

        // 2
        cinema.turnOn(new AdapterTheaterSystem(streetTheaterSystem));
    }
}
