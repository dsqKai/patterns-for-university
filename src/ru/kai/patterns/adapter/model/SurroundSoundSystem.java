package ru.kai.patterns.adapter.model;

public class SurroundSoundSystem {
    private static final SurroundSoundSystem instance = new SurroundSoundSystem();

    public static SurroundSoundSystem getInstance() {
        return instance;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public void setVolume(int volumeLevel) {

    }
}
