package by.epam.pronovich.training.lesson05.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PassangerTrain {

    private String destination;
    private String number;
    private String departureTime;
    private Locomotive locomotive;
    private List<Wagon> wagons;


    public PassangerTrain(String destination, String number, String departureTime, Locomotive locomotive) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
        this.locomotive = locomotive;
        this.wagons = new ArrayList<Wagon>();
    }

    public Wagon getWagon(int number) {
        Wagon result = null;
        if (number > 0 && number <= getWagons().size()) {
            result = getWagons().get(number - 1);
        }
        return result;
    }

    public boolean addWagon( Wagon wagon) {
        int number = getWagons().size();
        wagon.setNumber(number + 1);
        return getWagons().add(wagon);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
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
        PassangerTrain train = (PassangerTrain) o;
        return number == train.number &&
                Objects.equals(destination, train.destination) &&
                Objects.equals(departureTime, train.departureTime) &&
                Objects.equals(locomotive, train.locomotive) &&
                Objects.equals(wagons, train.wagons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, departureTime, locomotive, wagons);
    }

    @Override
    public String toString() {
        return "PassangerTrain{" +
                "Пункт назначения=" + destination +
                ", Номер поезда=" + number +
                ", Время прибытия='" + departureTime + '\'' +
                ", Тип=" + locomotive.getTypeOfEngine().getDescription() +
                ", Макс.Скорость=" + locomotive.getMaxSpeed() +
                ", количество вагонов=" + wagons.size() +
                '}';
    }
}
