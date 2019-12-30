package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.entity.enumproject.CargoType;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoWagon that = (CargoWagon) o;
        return maxCapacity == that.maxCapacity &&
                maxTonnage == that.maxTonnage &&
                tonnage == that.tonnage &&
                cargoType == that.cargoType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cargoType, maxCapacity, maxTonnage, tonnage);
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
