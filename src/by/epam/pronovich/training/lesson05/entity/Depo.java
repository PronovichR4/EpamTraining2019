package by.epam.pronovich.training.lesson05.entity;

import java.util.List;

public class Depo {

    private List<PassangerTrain> trains;

    public Depo(List<PassangerTrain> trains) {
        this.trains = trains;
    }

    public List<PassangerTrain> getTrains() {
        return trains;
    }

    public PassangerTrain getTrain(int number) {
        PassangerTrain result = null;
        if (number <= trains.size() && number >= 1) {
            result = trains.get(number - 1);
        }
        return result;
    }
}
