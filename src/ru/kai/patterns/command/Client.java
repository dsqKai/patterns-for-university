package ru.kai.patterns.command;

import ru.kai.patterns.command.commands.SetHumidityCommand;
import ru.kai.patterns.command.commands.SetLightCommand;
import ru.kai.patterns.command.commands.SetTemperatureCommand;
import ru.kai.patterns.command.sensors.HumiditySensor;
import ru.kai.patterns.command.sensors.LightSensor;
import ru.kai.patterns.command.sensors.Sensor;
import ru.kai.patterns.command.sensors.TemperatureSensor;

public class Client {
    public static void main(String[] args) {
        Display display = new Display();
        Sensor humiditySensor = new HumiditySensor(60);
        Sensor lightSensor = new LightSensor(100);
        Sensor temperatureSensor = new TemperatureSensor(25.7);
        display.addCommand("setHumidity", new SetHumidityCommand(humiditySensor));
        display.addCommand("setLight", new SetLightCommand(lightSensor));
        display.addCommand("setTemp", new SetTemperatureCommand(temperatureSensor));
        display.execute("setHumidity", 100);
        System.out.println(humiditySensor.getValue());
    }
}
