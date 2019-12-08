package by.epam.pronovich.training.lesson05.logic;

import by.epam.pronovich.training.lesson05.entity.PassangerWagon;

public class PassangerWagonLogic {

    public boolean addPassanger(PassangerWagon wagon) {
        boolean result = false;
        int currentQuantityOFPassangers = wagon.getQuantityOFPassengers();
        if (checkFreePlace(wagon)) {
            wagon.setQuantityOFPassengers(++currentQuantityOFPassangers);
            result = true;
        }
        return result;
    }

    public boolean addLuggage(PassangerWagon wagon, int luggage) {
        boolean result = false;
        if (checkWeight(luggage)) {
            wagon.setWeightOfLuggageKG(luggage + wagon.getWeightOfLuggageKG());
            result = true;
        }
        return result;
    }

    public boolean checkFreePlace(PassangerWagon wagon) {
        boolean result = false;
        int currentQuantityOFPassangers = wagon.getQuantityOFPassengers();
        if (wagon.getMaxPassengers() - currentQuantityOFPassangers >= 1) {
            result = true;
        }
        return result;
    }

    public boolean checkWeight(int luggage) {
        return luggage <= PassangerWagon.MAX_MAS_LUGGAGE_KG;
    }
}

