package by.epam.pronovich.training.lesson05.dao.impl;

import by.epam.pronovich.training.lesson05.dao.TrainDao;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.exception.DAOException;
import by.epam.pronovich.training.lesson05.factory.TrainFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileTrainDao implements TrainDao {

    private static final Path TRAIN_SOURCES_PATH = Paths.get("resources", "train.txt");

    @Override
    public List<PassangerTrain> findAllTrains() throws DAOException {
        List<PassangerTrain> passangerTrains = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TRAIN_SOURCES_PATH.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    passangerTrains.add(TrainFactory.createPasTrain(line));
                } catch (IllegalArgumentException e) {
                    throw new DAOException();
                }
            }
        } catch (IOException e) {
            throw new DAOException(e);
        }
        return passangerTrains;
    }
}

