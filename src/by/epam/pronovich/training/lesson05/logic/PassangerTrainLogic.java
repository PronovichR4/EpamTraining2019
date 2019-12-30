package by.epam.pronovich.training.lesson05.logic;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.PassangerWagon;
import by.epam.pronovich.training.lesson05.entity.Wagon;
import by.epam.pronovich.training.lesson05.exception.TrainException;

import java.util.List;

public class PassangerTrainLogic {

    private final static PassangerTrainLogic INSTANCE = new PassangerTrainLogic();

    private PassangerTrainLogic() {
    }

    public static PassangerTrainLogic getINSTANCE() {
        return INSTANCE;
    }

    public  int calcPassangersInWagon(PassangerTrain train, int numberOfWagon) throws TrainException {
        int result = 0;
        if (!checkNumberOfWagon(train, numberOfWagon)) {
            throw new TrainException("Not correct number of wagon");
        }
        Wagon wagon = train.getWagon(numberOfWagon);
        if (wagon instanceof PassangerWagon) {
            PassangerWagon passangerWagon = (PassangerWagon) wagon;
            result = passangerWagon.getQuantityOFPassengers();
        } else {
            throw new TrainException("Not passanger wagon");
        }
        return result;
    }

    public  boolean addPassanger(PassangerTrain train, int numberOfWagon, int luggage) throws TrainException {
        PassangerWagonLogic wagonLogic = new PassangerWagonLogic();
        boolean result = false;
        if (!checkNumberOfWagon(train, numberOfWagon)) {
            throw new TrainException("Not correct number of wagon");
        }
        Wagon wagon = train.getWagon(numberOfWagon);
        if (wagon instanceof PassangerWagon) {
            PassangerWagon currentWagon = (PassangerWagon) wagon;
            if (wagonLogic.checkWeight(luggage) && wagonLogic.checkFreePlace(currentWagon)) {
                currentWagon.addPassanger();
                currentWagon.addLuggage(luggage);
                result = true;
            }
        }
        return result;
    }

    private  boolean checkNumberOfWagon(PassangerTrain train, int numberOfWagon) {
        boolean result = true;
        if (numberOfWagon < 1 || numberOfWagon > train.getQuantityOfWagons()) {
            result = false;
        }
        return result;
    }

    public  int calcAllPassangers(PassangerTrain train) {
        int result = 0;
        List<Wagon> wagons = train.getWagons();
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassangerWagon) {
                PassangerWagon currentWagon = (PassangerWagon) wagon;
                result += currentWagon.getQuantityOFPassengers();
            }
        }
        return result;
    }

    public  int calMaxQuantityPassangers(PassangerTrain train) {
        int result = 0;
        List<Wagon> wagons = train.getWagons();
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassangerWagon) {
                PassangerWagon currentWagon = (PassangerWagon) wagon;
                result += currentWagon.getMaxPassengers();
            }
        }
        return result;
    }

    public  int calcProcentLoadinPassamgers(PassangerTrain train) {
        double i = (double) 100 / calMaxQuantityPassangers(train);
        i = i * calcAllPassangers(train);
        return (int) i;
    }

    public  int calcAllWeightLuggage(PassangerTrain train) {
        int result = 0;
        List<Wagon> wagons = train.getWagons();
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassangerWagon) {
                PassangerWagon currentWagon = (PassangerWagon) wagon;
                result += currentWagon.getWeightOfLuggageKG();
            }
        }
        return result;
    }
}
