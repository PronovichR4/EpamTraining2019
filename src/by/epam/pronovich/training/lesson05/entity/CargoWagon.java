package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.type.CargoType;

public class CargoWagon extends Wagon {

    private CargoType cargoType;
    private int maxCapacity;
    private int maxTonnage;
    private int tonnage;


    public CargoWagon(CargoType cargoType) {
        this.cargoType = cargoType;
        this.maxCapacity = cargoType.getMaxCapacity();
        this.maxTonnage = cargoType.getMaxTonnage();
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    @Override
    public String toString() {
        return "CargoWagon{" +
                "cargoType=" + cargoType.getDescription() +
                ", maxCapacity=" + maxCapacity +
                ", maxTonnage=" + maxTonnage +
                ", tonnage=" + tonnage +
                "} " + super.toString();
    }
}
