package ru.kai.patterns.adapter.model;

public class TV {
    private static final TV instance = new TV();

    public static TV getInstance() {
        return instance;
    }
    public void turnOn() {

    }

    public void turnOff() {

    }

    public void changeChannel(int channelNumber) {

    }

    public void adjustVolume(int volumeLevel) {

    }
}
