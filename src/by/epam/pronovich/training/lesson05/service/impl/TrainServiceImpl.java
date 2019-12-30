package by.epam.pronovich.training.lesson05.service.impl;

import by.epam.pronovich.training.lesson05.dao.DAOProvider;
import by.epam.pronovich.training.lesson05.dao.TrainDao;
import by.epam.pronovich.training.lesson05.dao.impl.FileTrainDao;
import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.exception.DAOException;
import by.epam.pronovich.training.lesson05.exception.ServiceException;
import by.epam.pronovich.training.lesson05.service.TrainService;

import java.util.List;

public class TrainServiceImpl implements TrainService {

    @Override
    public Depo findAllTrains() throws ServiceException {
        DAOProvider daoProvider = DAOProvider.getINSTANCE();
        TrainDao trainDao = daoProvider.getTrainDao();
        Depo result;
        try {
            result = trainDao.findAllTrains();
        } catch (DAOException e) {
            throw new ServiceException("Зайдите попозже, такого файла нет.", e);
        }
        return result;
    }
}
