package ru.kai.patterns.command.sensors;

public abstract class Sensor {
    private double value;

    public Sensor(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
