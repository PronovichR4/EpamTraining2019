package by.epam.pronovich.training.lesson05.entity;

public class Wagon {
    
    private int number;

    public Wagon() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Номер вагона=" + number;
    }
}
