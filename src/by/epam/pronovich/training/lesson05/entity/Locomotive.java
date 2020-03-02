package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.entity.enumproject.EngineLocomotiveType;
import java.util.Objects;

public class Locomotive {

    private int ID;
    private static int counterID;
    private int maxSpeed;
    private EngineLocomotiveType typeOfEngine;

    public Locomotive() {
    }

    public Locomotive(int maxSpeed, EngineLocomotiveType typeOfEngine) {
        this.ID = ++counterID;
        this.maxSpeed = maxSpeed;
        this.typeOfEngine = typeOfEngine;
    }

    public int getID() {
        return ID;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public EngineLocomotiveType getTypeOfEngine() {
        return typeOfEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locomotive that = (Locomotive) o;
        return ID == that.ID &&
                maxSpeed == that.maxSpeed &&
                typeOfEngine == that.typeOfEngine;
    }

    @Override
    public int hashCode() {

        return Objects.hash(ID, maxSpeed, typeOfEngine);
    }

    @Override
    public String toString() {
        return "Locomotive{" + "ID=" + ID +
                "maxSpeed=" + maxSpeed +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
