package by.epam.pronovich.training.lesson05.entity.wagon;

import by.epam.pronovich.training.lesson05.entity.enumproject.CargoWagonType;

import java.util.Objects;

public class CargoWagon extends Wagon {

    private CargoWagonType cargoType;
    private int maxCapacity;
    private int maxTonnage;
    private int tonnage;

    public CargoWagon() {
    }

    public CargoWagon(CargoWagonType cargoType) {
        this.cargoType = cargoType;
        this.maxCapacity = cargoType.getMaxCapacity();
        this.maxTonnage = cargoType.getMaxTonnage();
    }

    public void setCargoType(CargoWagonType cargoType) {
        this.cargoType = cargoType;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public CargoWagonType getCargoType() {
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
