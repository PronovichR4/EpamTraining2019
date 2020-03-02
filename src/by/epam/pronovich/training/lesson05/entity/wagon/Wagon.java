package by.epam.pronovich.training.lesson05.entity.wagon;

import java.util.Objects;

public abstract class Wagon {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wagon wagon = (Wagon) o;
        return number == wagon.number;
    }

    @Override
    public int hashCode() {

        return Objects.hash(number);
    }
}
