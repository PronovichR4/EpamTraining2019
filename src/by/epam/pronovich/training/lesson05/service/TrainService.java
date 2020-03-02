package by.epam.pronovich.training.lesson05.service;

import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.exception.ServiceException;

public interface TrainService {

    Depo findTrainsCityDay(String departurePoint, String dayOfWeek) throws ServiceException;

    Depo findTrainsRouteDay(String departurePoint, String destination, String dayOfWeek) throws ServiceException;
}

