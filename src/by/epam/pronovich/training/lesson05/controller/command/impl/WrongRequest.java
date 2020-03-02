package by.epam.pronovich.training.lesson05.controller.command.impl;

import by.epam.pronovich.training.lesson05.controller.command.Command;

public class WrongRequest implements Command {

    @Override
    public String execute(String request) {
        return "Вы ввели неверную команду: \"" + request.toUpperCase() + "\" такой команды не существует.";
    }
}
