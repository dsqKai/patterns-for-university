package ru.kai.patterns.command;

import ru.kai.patterns.command.commands.Command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Display {
    Map<String, Command> commands = new HashMap<>();

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public void removeCommand(String name) {
        commands.remove(name);
    }

    public boolean execute(String name, Object... args) {
        if(!commands.containsKey(name))
            return false;
        return commands.get(name).execute(Arrays.stream(args).map(Object::toString).toArray(String[]::new));
    }
}
