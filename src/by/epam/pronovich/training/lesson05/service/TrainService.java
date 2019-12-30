package by.epam.pronovich.training.lesson05.service;

import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.exception.ServiceException;

import java.util.List;

public interface TrainService {

    Depo findAllTrains() throws ServiceException;
}
