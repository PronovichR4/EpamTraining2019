package by.epam.pronovich.training.lesson05.entity.enumproject;

public enum EngineLocomotiveType {

    DIESEL("Дизель-поезд"),
    ELECTRIC("Электропоезд");

    private final String description;

    EngineLocomotiveType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
