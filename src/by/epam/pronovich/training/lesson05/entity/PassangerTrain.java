package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.entity.enumproject.City;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PassangerTrain {

    private City destination;
    private String number;
    private Locomotive locomotive;
    private List<Wagon> wagons;
    private DayOfWeek dayOfWeek;
    private LocalTime time;

    public PassangerTrain(City destination, String number, Locomotive locomotive, DayOfWeek dayOfWeek, LocalTime time) {
        this.destination = destination;
        this.number = number;
        this.locomotive = locomotive;
        this.wagons = new ArrayList<Wagon>();
        this.dayOfWeek = dayOfWeek;
        this.time = time;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Wagon getWagon(int number) {
        Wagon result = null;
        if (number > 0 && number <= getWagons().size()) {
            result = getWagons().get(number - 1);
        }
        return result;
    }

    public boolean addWagon(Wagon wagon) {
        int number = getWagons().size();
        wagon.setNumber(number + 1);
        return getWagons().add(wagon);
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public int getQuantityOfWagons() {
        return getWagons().size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassangerTrain that = (PassangerTrain) o;
        return destination == that.destination &&
                Objects.equals(number, that.number) &&
                Objects.equals(locomotive, that.locomotive) &&
                Objects.equals(wagons, that.wagons) &&
                dayOfWeek == that.dayOfWeek &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, locomotive, wagons);
    }

    @Override
    public String toString() {
        return "PassangerTrain{" +
                "destination=" + destination +
                ", number='" + number + '\'' +
                ", locomotive=" + locomotive +
                ", wagons=" + wagons +
                ", dayOfWeek=" + dayOfWeek +
                ", time=" + time +
                '}';
    }
}
