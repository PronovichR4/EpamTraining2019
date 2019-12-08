package by.epam.pronovich.training.lesson05.type;

public enum EngineType {

    DIESEL("Дизель-поезд"),
    ELECTRIC("Электропоезд");

    private final String description;

    EngineType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
