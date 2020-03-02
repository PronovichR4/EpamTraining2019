package by.epam.pronovich.training.lesson05.dao;

import by.epam.pronovich.training.lesson05.dao.impl.FileTrainDao;

public class DAOProvider {

    private static final DAOProvider INSTANCE = new DAOProvider();
    private TrainDao trainDao = new FileTrainDao();

    private DAOProvider() {
    }

    public static DAOProvider getINSTANCE() {
        return INSTANCE;
    }

    public TrainDao getTrainDao() {
        return trainDao;
    }
}
