package by.epam.pronovich.training.lesson05.logic;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.PassangerWagon;
import by.epam.pronovich.training.lesson05.entity.Wagon;

import java.util.List;

public class PassangerTrainLogic {

    private Wagon getWagon(PassangerTrain train, int number) {
        Wagon result = null;
        if (number > 0 && number <= train.getWagons().size()) {
            result = train.getWagons().get(number - 1);
        }
        return result;
    }

    public int getPassangers(PassangerTrain train, int number) {
        int result = 0;
        if (!checkNumberOfWagon(train, number)) {
            System.out.print("Not correct number of wagon ");
            return result;
        }
        Wagon wagon = getWagon(train, number);
        if (wagon instanceof PassangerWagon) {
            PassangerWagon passangerWagon = (PassangerWagon) wagon;
            result = passangerWagon.getQuantityOFPassengers();
        } else {
            System.out.print("Not passanger wagon ");
        }
        return result;
    }

    public boolean addWagon(PassangerTrain train, Wagon wagon) {
        int number = train.getWagons().size();
        wagon.setNumber(number + 1);
        return train.getWagons().add(wagon);
    }

    public int getQuantityOfWagons(PassangerTrain train) {
        return train.getWagons().size();
    }

    public boolean addPassanger(PassangerTrain train, int numberOfWagon, int luggage) {
        PassangerWagonLogic wagonLogic = new PassangerWagonLogic();
        boolean result = false;
        Wagon wagon = getWagon(train, numberOfWagon);
        if (wagon instanceof PassangerWagon) {
            PassangerWagon currentWagon = (PassangerWagon) wagon;
            if (wagonLogic.checkWeight(luggage) && wagonLogic.checkFreePlace(currentWagon)) {
                result = wagonLogic.addPassanger(currentWagon) && wagonLogic.addLuggage(currentWagon, luggage);
            }
        }
        return result;
    }

    private boolean checkNumberOfWagon(PassangerTrain train, int number) {
        boolean result = true;
        if (number < 0 || number > getQuantityOfWagons(train)) {
            result = false;
        }
        return result;
    }

    public int calculateAllPassangers(PassangerTrain train) {
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

    public int calculateMaxQuantityPassangers(PassangerTrain train) {
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

    public int calculateProcentLoadinPassamgers(PassangerTrain train) {
        double i = (double) 100 / calculateMaxQuantityPassangers(train);
        i = i * calculateAllPassangers(train);
        return (int) i;
    }

    public int calculateAllWeightLuggage(PassangerTrain train) {
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
