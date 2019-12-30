package by.epam.pronovich.training.lesson05.service;

import by.epam.pronovich.training.lesson05.service.impl.TrainServiceImpl;

public class ServiceProvider {

    private final static ServiceProvider INSTANCE = new ServiceProvider();

    private ServiceProvider() {

    }

    public static ServiceProvider getINSTANCE() {
        return INSTANCE;
    }

    private TrainService trainService = new TrainServiceImpl();

    public TrainService getTrainService() {
        return trainService;
    }
}
