package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.type.EngineType;

public class Locomotive {

    private int ID;
    private static int counterID;
    private int maxSpeed;
    private EngineType typeOfEngine;

    public Locomotive(int maxSpeed, EngineType typeOfEngine) {
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

    public EngineType getTypeOfEngine() {
        return typeOfEngine;
    }

    @Override
    public String toString() {
        return "Locomotive{" + "ID=" + ID +
                "maxSpeed=" + maxSpeed +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
