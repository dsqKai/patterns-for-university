package ru.kai.patterns.observer;

public class WeatherHandler implements Observer {
    private WeatherData subject;
    private String name;

    public WeatherHandler(String name, Subject subject){
        this.subject = (WeatherData) subject;
        this.name = name;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println();
        System.out.println("Parameters changed | %s".formatted(name));
        System.out.println("TemperaturePast: " + subject.getTemperature());
        System.out.println("PressurePast: " + subject.getPressure());
        System.out.println("HumidityPast: " + subject.getHumidity());
    }
}
