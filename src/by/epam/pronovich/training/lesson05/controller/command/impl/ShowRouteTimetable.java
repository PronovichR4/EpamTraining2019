package by.epam.pronovich.training.lesson05.controller.command.impl;

import by.epam.pronovich.training.lesson05.controller.command.Command;
import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.exception.ServiceException;
import by.epam.pronovich.training.lesson05.service.ServiceProvider;
import by.epam.pronovich.training.lesson05.service.TrainService;
import by.epam.pronovich.training.lesson05.utill.printer.PrintUtill;

public class ShowRouteTimetable implements Command {

    private final String PARAM_DELEMITER = "\\s+";
    private final int SIZE_OF_RESPONSE = 4;
    private final int DEPARTURE_POINT_INDEX_FROM_REQUEST = 1;
    private final int DESTINATION_INDEX_FROM_REQUEST = 2;
    private final int DAY_OF_WEEK_INDEX_FROM_REQUEST = 3;

    @Override
    public String execute(String request) {
        String[] params = request.split(PARAM_DELEMITER);
        String departurePoint = null;
        String destination = null;
        String day = null;
        String response = null;

        if (params.length == SIZE_OF_RESPONSE) {
            departurePoint = params[DEPARTURE_POINT_INDEX_FROM_REQUEST];
            destination = params[DESTINATION_INDEX_FROM_REQUEST];
            day = params[DAY_OF_WEEK_INDEX_FROM_REQUEST];
        } else {
            return "Введите город, день отправления, пункт назначения.";
        }

        ServiceProvider instance = ServiceProvider.getINSTANCE();
        TrainService trainService = instance.getTrainService();

        try {
            Depo allTrains = trainService.findTrainsRouteDay(departurePoint, destination, day);
            response = PrintUtill.parsDepoToString(allTrains);
        } catch (ServiceException e) {
            response = e.getMessage();
        }
        return response;
    }
}
