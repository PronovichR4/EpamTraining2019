package by.epam.pronovich.training.lesson05.entity;

import java.util.List;
import java.util.Objects;

public class Depo {

    private List<PassangerTrain> trains;

    public Depo() {
    }

    public Depo(List<PassangerTrain> trains) {
        this.trains = trains;
    }

    public List<PassangerTrain> getTrains() {
        return trains;
    }

    public void setTrains(List<PassangerTrain> trains) {
        this.trains = trains;
    }

    public PassangerTrain getTrain(int number) {
        PassangerTrain result = null;
        if (number <= trains.size() && number >= 1) {
            result = trains.get(number - 1);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depo depo = (Depo) o;
        return Objects.equals(trains, depo.trains);
    }

    @Override
    public int hashCode() {

        return Objects.hash(trains);
    }

    @Override
    public String toString() {
        return "Depo{" +
                "trains=" + trains +
                '}';
    }

}
