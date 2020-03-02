package by.epam.pronovich.training.lesson05.controller;

import by.epam.pronovich.training.lesson05.controller.command.Command;

public class Controller {

    private final CommandProvider commandProvider = new CommandProvider();
    private final String PARAM_DELEMITER = " ";
    private final int COMMAND_INDEX_FROM_REQUEST = 0;

    public String doAction(String request) {
        String commandName;
        Command executionCommand;
        commandName = request.split(PARAM_DELEMITER)[COMMAND_INDEX_FROM_REQUEST];
        executionCommand = commandProvider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
