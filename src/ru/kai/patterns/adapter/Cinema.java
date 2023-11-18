package ru.kai.patterns.adapter;

import ru.kai.patterns.adapter.model.*;

public class Cinema {
    private final DVDPlayer dvdPlayer = DVDPlayer.getInstance();
    private HomeTheaterSystem theaterSystem;
    private final Projector projector = Projector.getInstance();
    private final SurroundSoundSystem soundSystem = SurroundSoundSystem.getInstance();
    private final TV tv = TV.getInstance();

    public void turnOn(HomeTheaterSystem theaterSystem) {
        this.theaterSystem = theaterSystem;
        theaterSystem.turnOn();
        soundSystem.turnOn();
        projector.turnOn();
        tv.turnOn();
        dvdPlayer.play();
    }

    public void turnOff() {
        dvdPlayer.stop();
        projector.turnOff();
        soundSystem.turnOff();
        theaterSystem.turnOff();
        tv.turnOff();
    }

    public void changeMovie(String titleMovie) {
        dvdPlayer.stop();
        theaterSystem.playMovie(titleMovie);
        dvdPlayer.play();
    }
}
