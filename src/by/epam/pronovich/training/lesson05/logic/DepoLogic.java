package by.epam.pronovich.training.lesson05.logic;

import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.exception.TrainException;

import java.util.List;

public class DepoLogic {

    private final static DepoLogic INSTANCE = new DepoLogic();

    private DepoLogic() {

    }

    public static DepoLogic getINSTANCE() {
        return INSTANCE;
    }

    public PassangerTrain findTrainByNumber(String number, Depo depo) throws TrainException {
        PassangerTrain result = null;
        List<PassangerTrain> trains = depo.getTrains();
        for (PassangerTrain train : trains) {
            if (train.getNumber().equalsIgnoreCase(number)) {
                result = train;
            }
        }
        if (result == null) {
            throw new TrainException("Поезда с таким номером нет");
        }
        return result;
    }
}
