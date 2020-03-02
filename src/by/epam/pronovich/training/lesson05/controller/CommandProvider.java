package by.epam.pronovich.training.lesson05.controller;

import by.epam.pronovich.training.lesson05.controller.command.Command;
import by.epam.pronovich.training.lesson05.controller.command.CommandName;
import by.epam.pronovich.training.lesson05.controller.command.impl.ShowRouteTimetable;
import by.epam.pronovich.training.lesson05.controller.command.impl.ShowTimetable;
import by.epam.pronovich.training.lesson05.controller.command.impl.WrongRequest;

import java.util.HashMap;

public final class CommandProvider {

    private final HashMap<CommandName, Command> commandBox = new HashMap<>();

    CommandProvider() {
        commandBox.put(CommandName.SHOW_TIMETABLE, new ShowTimetable());
        commandBox.put(CommandName.SHOW_ROUTE_TIMETABLE, new ShowRouteTimetable());
        commandBox.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    public Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = commandBox.get(commandName);
        } catch (IllegalArgumentException e) {
            command = commandBox.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
