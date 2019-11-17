package by.epam.pronovich.training.lesson01.task5;

import java.util.Scanner;

public class Task5 {

    private static final int QUANTITY_OF_DIGITS = 6;
    private static final int MIN_VALUE = 100000;
    private static final int MAX_VALUE = 999999;

    public static void main(String[] args) {
        int testValue = inputNaturalValue();
        System.out.println(findArithmeticMean(testValue));
        System.out.println(geometricMean(testValue));

    }

    public static double findArithmeticMean(int value) {
        double aritmeticMean = 0;
        int summ = 0;
        if (checkValue(value) == 0) {
            return aritmeticMean;
        }
        while (value != 0) {
            summ += value % 10;
            value /= 10;
        }
        aritmeticMean = (double) summ / QUANTITY_OF_DIGITS;
        return aritmeticMean;
    }

    public static double geometricMean(int value) {
        double geometricMean = 0;
        int multiplication = 1;
        if (checkValue(value) == 0) {
            return geometricMean;
        }
        while (value != 0) {
            multiplication *= value % 10;
            value /= 10;
        }
        geometricMean = Math.pow(multiplication, (1.0 / QUANTITY_OF_DIGITS));
        return geometricMean;
    }

    public static int inputNaturalValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">");
        while (!scanner.hasNextInt()) {
            System.out.println(">");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static int checkValue(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            System.out.println("Please, input " + QUANTITY_OF_DIGITS + " digits value");
            return 0;
        } else return 1;
    }
}
