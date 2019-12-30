package by.epam.pronovich.training.lesson05.dao.impl;

import by.epam.pronovich.training.lesson05.dao.TrainDao;
import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.Locomotive;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.enumproject.City;
import by.epam.pronovich.training.lesson05.entity.enumproject.EngineType;
import by.epam.pronovich.training.lesson05.exception.DAOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FileTrainDao implements TrainDao {

    private static final Path TRAIN_SOURCES_PATH = Paths.get("resources", "train.txt");

    @Override
    public Depo findAllTrains() throws DAOException {
        List<PassangerTrain> passangerTrains = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TRAIN_SOURCES_PATH.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] train = line.replaceAll(" ", "").split(",");
                int i = 0;
                try {
                    passangerTrains.add(new PassangerTrain(
                            City.valueOf(train[i]),
                            train[++i],
                            new Locomotive(Integer.parseInt(train[++i]), EngineType.valueOf(train[++i])),
                            DayOfWeek.valueOf(train[++i]),
                            LocalTime.of(Integer.parseInt(train[++i]), Integer.parseInt(train[++i]))));
                } catch (IllegalArgumentException e) {
                    System.out.println("Присутствует неверный параметр в строке");
                }
            }
        } catch (IOException e) {
            throw new DAOException(e);
        }
        return new Depo(passangerTrains);
    }
}

