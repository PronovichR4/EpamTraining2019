package by.epam.pronovich.training.lesson05.test;

import by.epam.pronovich.training.lesson05.entity.*;
import by.epam.pronovich.training.lesson05.logic.PassangerTrainLogic;
import by.epam.pronovich.training.lesson05.sort.DestinationComparator;
import by.epam.pronovich.training.lesson05.sort.MaxSpeedComparator;
import by.epam.pronovich.training.lesson05.utill.ReaderUtill;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static by.epam.pronovich.training.lesson05.type.ComfortType.*;
import static by.epam.pronovich.training.lesson05.type.EngineType.DIESEL;
import static by.epam.pronovich.training.lesson05.type.EngineType.ELECTRIC;

public class Main {

    public static void main(String[] args) {
        PassangerTrainLogic trainLogic = new PassangerTrainLogic();
        Path path = Paths.get("resources", "train.txt");
        List<PassangerTrain> depo = ReaderUtill.getTrainsFromFile(path);

        print(depo);
    }

    public static void print(List<PassangerTrain> trains) {
        for (PassangerTrain train : trains) {
            System.out.println(train);
        }
    }
}
