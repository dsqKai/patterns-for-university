package ru.kai.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> screens;
    private Double temperature = 34D;
    private Double pressure = 34D;
    private Double humidity = 34D;

    public WeatherData() {
        screens = new ArrayList<>();
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer screen) {
        screens.add(screen);
    }

    @Override
    public void removeObserver(Observer screen) {
        screens.remove(screen);
    }

    @Override
    public void notifyObservers() {
        screens.forEach(Observer::update);
    }
}
