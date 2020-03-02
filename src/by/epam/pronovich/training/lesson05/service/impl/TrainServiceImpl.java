package by.epam.pronovich.training.lesson05.service.impl;

import by.epam.pronovich.training.lesson05.dao.DAOProvider;
import by.epam.pronovich.training.lesson05.dao.TrainDao;
import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.enumproject.City;
import by.epam.pronovich.training.lesson05.exception.DAOException;
import by.epam.pronovich.training.lesson05.exception.ServiceException;
import by.epam.pronovich.training.lesson05.service.TrainService;
import by.epam.pronovich.training.lesson05.service.validator.Validator;
import by.epam.pronovich.training.lesson05.utill.sort.TimeTrainComparator;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class TrainServiceImpl implements TrainService {

    @Override
    public Depo findTrainsCityDay(String departurePoint, String dayOfWeek) throws ServiceException {
        DAOProvider instance = DAOProvider.getINSTANCE();
        TrainDao trainDao = instance.getTrainDao();
        List<PassangerTrain> passangerTrains = new ArrayList<>();
        Depo result = null;
        City cityDeparture = null;
        DayOfWeek day = null;

        if (Validator.isCity(departurePoint)) {
            cityDeparture = City.valueOf(departurePoint.toUpperCase());
        } else {
            throw new ServiceException("Неверное название города.");
        }

        if (Validator.isDay(dayOfWeek)) {
            day = DayOfWeek.valueOf(dayOfWeek.toUpperCase());
        } else {
            throw new ServiceException("Нет такого дня.");
        }

        try {
            List<PassangerTrain> allTrains = trainDao.findAllTrains();
            for (PassangerTrain train : allTrains) {
                if (train.getDeparturePoint().equals(cityDeparture) && train.getDayOfWeek().equals(day)) {
                    passangerTrains.add(train);
                }
            }
            passangerTrains.sort(new TimeTrainComparator());
            result = new Depo(passangerTrains);
        } catch (DAOException e) {
            throw new ServiceException("Технические неполадки.", e);
        }
        return result;
    }

    @Override
    public Depo findTrainsRouteDay(String departurePoint, String destination, String dayOfWeek) throws ServiceException {
        DAOProvider instance = DAOProvider.getINSTANCE();
        TrainDao trainDao = instance.getTrainDao();
        List<PassangerTrain> passangerTrains = new ArrayList<>();
        Depo result;

        City cityDeparture = null;
        City cityDestination = null;
        DayOfWeek day = null;

        if (Validator.isCity(departurePoint) && Validator.isCity(destination)) {
            cityDeparture = City.valueOf(departurePoint.toUpperCase());
            cityDestination = City.valueOf(destination.toUpperCase());
        } else {
            throw new ServiceException("Неверное название города.");
        }
        if (Validator.isDay(dayOfWeek)) {
            day = DayOfWeek.valueOf(dayOfWeek.toUpperCase());
        } else {
            throw new ServiceException("Нет такого дня.");
        }

        try {
            List<PassangerTrain> allTrains = trainDao.findAllTrains();
            for (PassangerTrain train : allTrains) {
                if (train.getDeparturePoint().equals(cityDeparture) && train.getDayOfWeek().equals(day)
                        && train.getDestination().equals(cityDestination)) {
                    passangerTrains.add(train);
                }
            }
            passangerTrains.sort(new TimeTrainComparator());
            result = new Depo(passangerTrains);
        } catch (DAOException e) {
            throw new ServiceException("Технические неполадки.", e);
        }
        return result;
    }
}
