package by.epam.pronovich.training.lesson05.entity.enumproject;

public enum ComfortType {

    COMMON(70, "Плацкартный"),
    COUPE(40, "Купейный"),
    BUSINESS(20, "Бизнес-класс"),
    ECONOM(80, "Сидячий");

    private final int maxPassengers;
    private final String description;

    ComfortType(int maxPassengers, String description) {
        this.maxPassengers = maxPassengers;
        this.description = description;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getDescription() {
        return description;
    }
}
