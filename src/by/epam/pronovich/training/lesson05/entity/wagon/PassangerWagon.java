package by.epam.pronovich.training.lesson05.entity.wagon;

import by.epam.pronovich.training.lesson05.entity.enumproject.ComfortWagonType;

import java.util.Objects;

public class PassangerWagon extends Wagon {

    public static final int MAX_MAS_LUGGAGE_KG = 20;
    private ComfortWagonType comfortType;
    private int maxPassengers;
    private int quantityOFPassengers;
    private int weightOfLuggageKG;

    public PassangerWagon() {
    }

    public PassangerWagon(ComfortWagonType comfortType) {
        this.comfortType = comfortType;
        this.maxPassengers = comfortType.getMaxPassengers();
    }

    public static int getMaxMasLuggageKg() {
        return MAX_MAS_LUGGAGE_KG;
    }

    public void addPassanger() {
        setQuantityOFPassengers(getQuantityOFPassengers() + 1);
    }

    public void addLuggage(int luggage) {
        setWeightOfLuggageKG(luggage + getWeightOfLuggageKG());
    }

    public ComfortWagonType getComfortType() {
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

    public void setComfortType(ComfortWagonType comfortType) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassangerWagon that = (PassangerWagon) o;
        return maxPassengers == that.maxPassengers &&
                quantityOFPassengers == that.quantityOFPassengers &&
                weightOfLuggageKG == that.weightOfLuggageKG &&
                comfortType == that.comfortType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), comfortType, maxPassengers, quantityOFPassengers, weightOfLuggageKG);
    }

    @Override
    public String toString() {
        return "PassangerWagon{" +
                "comfortType=" + comfortType +
                ", maxPassengers=" + maxPassengers +
                ", quantityOFPassengers=" + quantityOFPassengers +
                ", weightOfLuggageKG=" + weightOfLuggageKG +
                "} " + super.toString();
    }
}


