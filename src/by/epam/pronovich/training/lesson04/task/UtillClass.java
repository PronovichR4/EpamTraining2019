package by.epam.pronovich.training.lesson04.task;

import java.util.Random;

public final class UtillClass {

    private static final Random rand = new Random();
    private static final int DIAPOSON = 100;

    private UtillClass() {
    }

    public static void printBiArray(double[][] biArray) {
        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {
                System.out.printf("  %.3f  ", biArray[i][j]);
            }
            System.out.println();
        }
    }

    private static double generateRandomPositiveValue() {
        return rand.nextDouble() * DIAPOSON;
    }

    public static void inputRandomPositiveValueToBiArray(double[][] biArray) {
        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {
                biArray[i][j] = generateRandomPositiveValue();
            }
        }
    }
}
