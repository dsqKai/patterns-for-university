package ru.kai.patterns.command.commands;

public interface Command {
    boolean execute(String... args);
}
