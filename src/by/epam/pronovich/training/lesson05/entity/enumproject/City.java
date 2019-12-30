package by.epam.pronovich.training.lesson05.entity.enumproject;

public enum  City {

    MINSK("Минск"),
    BREST("Брест"),
    VITEBSK("Витебск"),
    GRODNO("Гродно");

    private String description;

    City(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
