package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.logic.PassangerWagonLogic;
import by.epam.pronovich.training.lesson05.type.ComfortType;

public class PassangerWagon extends Wagon {

    public static final int MAX_MAS_LUGGAGE_KG = 20;
    private ComfortType comfortType;
    private int maxPassengers;
    private int quantityOFPassengers;
    private int weightOfLuggageKG;

    public PassangerWagon(ComfortType comfortType) {
        this.comfortType = comfortType;
        this.maxPassengers = comfortType.getMaxPassengers();
    }

    public void addPassanger() {
        setQuantityOFPassengers(getQuantityOFPassengers() + 1);
    }

    public void addLuggage(int luggage) {
        setWeightOfLuggageKG(luggage + getWeightOfLuggageKG());
    }

    public ComfortType getComfortType() {
        return comfortType;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getQuantityOFPassengers() {
        return quantityOFPassengers;
    }

    public int getWeightOfLuggageKG() {
        return weightOfLuggageKG;
    }

    public void setComfortType(ComfortType comfortType) {
        this.comfortType = comfortType;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setQuantityOFPassengers(int quantityOFPassengers) {
        this.quantityOFPassengers = quantityOFPassengers;
    }

    public void setWeightOfLuggageKG(int weightOfLuggageKG) {
        this.weightOfLuggageKG = weightOfLuggageKG;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", comfortType=" + comfortType.getDescription() +
                ", maxPassengers=" + maxPassengers +
                ", quantityOFPassengers=" + quantityOFPassengers +
                ", weightOfLuggageKG=" + weightOfLuggageKG +
                "} ";
    }
}


