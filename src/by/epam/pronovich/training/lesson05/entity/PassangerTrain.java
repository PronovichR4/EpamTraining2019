package by.epam.pronovich.training.lesson05.entity;

import by.epam.pronovich.training.lesson05.entity.enumproject.City;
import by.epam.pronovich.training.lesson05.entity.wagon.Wagon;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PassangerTrain {

    private String number;
    private City departurePoint;
    private City destination;
    private Locomotive locomotive;
    private List<Wagon> wagons = new ArrayList<Wagon>();
    private DayOfWeek dayOfWeek;
    private LocalTime deparureTime;
    private LocalTime arrivalTime;

    public PassangerTrain() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public City getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(City departurePoint) {
        this.departurePoint = departurePoint;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
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

    public LocalTime getDeparureTime() {
        return deparureTime;
    }

    public void setDeparureTime(LocalTime deparureTime) {
        this.deparureTime = deparureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
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
        return departurePoint == that.departurePoint &&
                destination == that.destination &&
                Objects.equals(number, that.number) &&
                Objects.equals(locomotive, that.locomotive) &&
                Objects.equals(wagons, that.wagons) &&
                dayOfWeek == that.dayOfWeek &&
                Objects.equals(deparureTime, that.deparureTime) &&
                Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, locomotive, wagons);
    }

    @Override
    public String toString() {
        return "PassangerTrain{" +
                "departurePoint=" + departurePoint +
                ", destination=" + destination +
                ", number='" + number + '\'' +
                ", locomotive=" + locomotive +
                ", wagons=" + wagons +
                ", dayOfWeek=" + dayOfWeek +
                ", deparureTime=" + deparureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
