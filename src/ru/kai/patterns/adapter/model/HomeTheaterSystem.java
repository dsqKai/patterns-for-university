package ru.kai.patterns.adapter.model;

public class HomeTheaterSystem {
    private boolean isEnable = false;

    private int volume = 0;

    public void turnOn() {
        isEnable = true;
    }

    public void turnOff() {
        isEnable = false;
    }

    private static final HomeTheaterSystem instance = new HomeTheaterSystem();

    public static HomeTheaterSystem getInstance() {
        return instance;
    }

    public void playMovie(String movieTitle) {
       // TODO
    }

    public void stopMovie() {
        // TODO
    }

    public void adjustVolume(int volumeLevel) {
        volume = volumeLevel;
    }
}
