package by.epam.pronovich.training.lesson04.task;

public class Main {

    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        double[][] array = new double[row][column];
        UtillClass.inputRandomPositiveValueToBiArray(array);
        UtillClass.printBiArray(array);
        System.out.println();
        Task.transponirArray(array);
        UtillClass.printBiArray(array);

        System.out.printf("Min value:   %.3f  %n", Task.findMinValue(array));
        System.out.printf("Max value:   %.3f  %n", Task.findMaxValue(array));
        System.out.printf("Arithmetic mean:  %.3f  %n", Task.calculateArithmeticMean(array));
        System.out.printf("Geometric mean:  %.3f  %n", Task.calculateGeometricMean(array));

        Task.findLocalMinPosition(array);
        Task.findLocalMaxPosition(array);

    }
}

