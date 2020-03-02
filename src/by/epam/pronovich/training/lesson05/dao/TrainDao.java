package by.epam.pronovich.training.lesson05.dao;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.exception.DAOException;

import java.util.List;

public interface TrainDao {

    List<PassangerTrain> findAllTrains() throws DAOException;
}
