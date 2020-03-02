package by.epam.pronovich.training.lesson05.factory;

import by.epam.pronovich.training.lesson05.entity.Locomotive;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.enumproject.City;
import by.epam.pronovich.training.lesson05.entity.enumproject.EngineLocomotiveType;
import java.time.DayOfWeek;
import java.time.LocalTime;

public final class TrainFactory {

    private TrainFactory() {
    }

    public static PassangerTrain createPasTrain(String value) {
        String[] train = value.replaceAll(" ", "").split(",");
        PassangerTrain passangerTrain = new PassangerTrain();
        int i = 0;
        passangerTrain.setDeparturePoint(City.valueOf(train[i]));
        passangerTrain.setDestination(City.valueOf(train[++i]));
        passangerTrain.setNumber(train[++i]);
        passangerTrain.setLocomotive(new Locomotive(Integer.parseInt(train[++i]), EngineLocomotiveType.valueOf(train[++i])));
        passangerTrain.setDayOfWeek(DayOfWeek.valueOf(train[++i]));
        passangerTrain.setDeparureTime(LocalTime.of(Integer.parseInt(train[++i]), Integer.parseInt(train[++i])));
        passangerTrain.setArrivalTime(LocalTime.of(Integer.parseInt(train[++i]), Integer.parseInt(train[++i])));
        return passangerTrain;
    }
}
