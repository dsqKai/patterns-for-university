package ru.kai.patterns.observer;
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherHandler handler = new WeatherHandler("Handler #1", weatherData);
        WeatherHandler handler2 = new WeatherHandler("Handler #2", weatherData);
        weatherData.setTemperature(24D);
    }
}