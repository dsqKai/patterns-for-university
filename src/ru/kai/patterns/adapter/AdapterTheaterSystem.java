package ru.kai.patterns.adapter;

import ru.kai.patterns.adapter.model.HomeTheaterSystem;
import ru.kai.patterns.adapter.model.StreetTheaterSystem;

public class AdapterTheaterSystem extends HomeTheaterSystem {
    private final StreetTheaterSystem adapt;

    public AdapterTheaterSystem(StreetTheaterSystem adapt) {
        this.adapt = adapt;
    }

    @Override
    public void turnOn() {
        adapt.specificMethod();
    }
}
