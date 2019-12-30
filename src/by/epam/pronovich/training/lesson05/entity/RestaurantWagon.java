package by.epam.pronovich.training.lesson05.entity;

import java.util.Objects;

public class RestaurantWagon extends Wagon {

    private int table;

    public RestaurantWagon() {
        this.table = 15;
    }

    public int getTable() {
        return table;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RestaurantWagon that = (RestaurantWagon) o;
        return table == that.table;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), table);
    }

    @Override
    public String toString() {
        return "RestaurantWagon{" +
                "table=" + table +
                "} " + super.toString();
    }
}
