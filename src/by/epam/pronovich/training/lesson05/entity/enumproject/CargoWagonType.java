package by.epam.pronovich.training.lesson05.entity.enumproject;

public enum CargoWagonType {

    BOXCAR("Крытый вагон", 138, 68),
    OPENWAGON("Полувагон", 75, 71),
    PLATFORM("Платформа", 0, 71),
    CISTERN("Цистерна", 83, 67);

    private final String description;
    private final int maxCapacity;
    private final int maxTonnage;

    CargoWagonType(String description, int capacity, int tonnage) {
        this.description = description;
        this.maxCapacity = capacity;
        this.maxTonnage = tonnage;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }
}
