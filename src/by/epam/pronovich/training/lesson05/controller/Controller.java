package by.epam.pronovich.training.lesson05.controller;

import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.exception.ServiceException;
import by.epam.pronovich.training.lesson05.service.ServiceProvider;
import by.epam.pronovich.training.lesson05.service.TrainService;

public class Controller {

    public Depo getDepo() {
        ServiceProvider instance = ServiceProvider.getINSTANCE();
        TrainService trainService = instance.getTrainService();
        Depo result;
        try {
            result = trainService.findAllTrains();
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }
}
