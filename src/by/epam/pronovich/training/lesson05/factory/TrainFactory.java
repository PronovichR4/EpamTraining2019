package by.epam.pronovich.training.lesson05.factory;

import by.epam.pronovich.training.lesson05.entity.Locomotive;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.enumproject.City;
import by.epam.pronovich.training.lesson05.entity.enumproject.EngineLocomotiveType;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.*;

public final class TrainFactory {

    private TrainFactory() {
    }

    public static PassangerTrain createPasTrain(String value) {
        Queue<String> trainParams = makeTrainParams(value);
        PassangerTrain passangerTrain = new PassangerTrain();
        passangerTrain.setDeparturePoint(City.valueOf(trainParams.poll()));
        passangerTrain.setDestination(City.valueOf(trainParams.poll()));
        passangerTrain.setNumber(trainParams.poll());
        passangerTrain.setLocomotive(new Locomotive(Integer.parseInt(trainParams.poll()), EngineLocomotiveType.valueOf(trainParams.poll())));
        passangerTrain.setDayOfWeek(DayOfWeek.valueOf(trainParams.poll()));
        passangerTrain.setDeparureTime(LocalTime.of(Integer.parseInt(trainParams.poll()), Integer.parseInt(trainParams.poll())));
        passangerTrain.setArrivalTime(LocalTime.of(Integer.parseInt(trainParams.poll()), Integer.parseInt(trainParams.poll())));
        return passangerTrain;
    }

    private static Queue<String> makeTrainParams(String value) {
        String[] params = value.replaceAll(" ", "").split(",");
        Queue<String> trainParams = new LinkedList<>(Arrays.asList(params));
        return trainParams;
    }
}
