package by.epam.pronovich.training.lesson05.logic;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.PassangerWagon;
import by.epam.pronovich.training.lesson05.entity.Wagon;

import java.util.List;

public class PassangerTrainLogic {

    public int calcPassangersInWagon(PassangerTrain train, int numberOfWagon) {
        int result = 0;
        if (!checkNumberOfWagon(train, numberOfWagon)) {
            System.out.print("Not correct number of wagon ");
            return result;
        }
        Wagon wagon = train.getWagon(numberOfWagon);
        if (wagon instanceof PassangerWagon) {
            PassangerWagon passangerWagon = (PassangerWagon) wagon;
            result = passangerWagon.getQuantityOFPassengers();
        } else {
            System.out.print("Not passanger wagon ");
        }
        return result;
    }

    public boolean addPassanger(PassangerTrain train, int numberOfWagon, int luggage) {
        PassangerWagonLogic wagonLogic = new PassangerWagonLogic();
        boolean result = false;
        if (!checkNumberOfWagon(train, numberOfWagon)) {
            System.out.println("Not correct number of wagon ");
            return result;
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

    private boolean checkNumberOfWagon(PassangerTrain train, int numberOfWagon) {
        boolean result = true;
        if (numberOfWagon < 1 || numberOfWagon > train.getQuantityOfWagons()) {
            result = false;
        }
        return result;
    }

    public int calcAllPassangers(PassangerTrain train) {
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

    public int calMaxQuantityPassangers(PassangerTrain train) {
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

    public int calcProcentLoadinPassamgers(PassangerTrain train) {
        double i = (double) 100 / calMaxQuantityPassangers(train);
        i = i * calcAllPassangers(train);
        return (int) i;
    }

    public int calcAllWeightLuggage(PassangerTrain train) {
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
