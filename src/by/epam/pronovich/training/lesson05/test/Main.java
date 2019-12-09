package by.epam.pronovich.training.lesson05.test;

import by.epam.pronovich.training.lesson05.entity.*;
import by.epam.pronovich.training.lesson05.logic.PassangerTrainLogic;
import by.epam.pronovich.training.lesson05.utill.ReaderUtill;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static by.epam.pronovich.training.lesson05.type.ComfortType.*;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("resources", "train.txt");
        Depo depo = new Depo(ReaderUtill.getTrainsFromFile(path));
        PassangerTrainLogic trainLogic = new PassangerTrainLogic();

        PassangerTrain passangerTrain = depo.getTrain(1);

        print(depo);

        passangerTrain.addWagon(new PassangerWagon(ECONOM));
        passangerTrain.addWagon(new PassangerWagon(BUSINESS));

        trainLogic.addPassanger(passangerTrain, 3, 15);
        trainLogic.addPassanger(passangerTrain, 1, 10);
        trainLogic.addPassanger(passangerTrain, 2, 7);

        System.out.println(trainLogic.calcPassangersInWagon(passangerTrain, 1));

        System.out.println(trainLogic.calcAllPassangers(passangerTrain));

        System.out.println(trainLogic.calcAllWeightLuggage(passangerTrain));

        System.out.println(passangerTrain);
    }

    public static void print(Depo depo) {
        List<PassangerTrain> trains = depo.getTrains();
        for (PassangerTrain train : trains) {
            System.out.println(train);
        }
    }
}

