package by.epam.pronovich.training.lesson01.task4;

import java.util.Scanner;

public class Task4 {

    private static final int QUANTITY_OF_DIGITS = 4;
    private static final int MIN_VALUE = 1000;
    private static final int MAX_VALUE = 9999;

    public static void main(String[] args) {
        int value = inputNaturalValue();
        isIncreasingOrDecreasingSequence(value);
    }

    public static boolean isIncreasingSequence(int value) {
        boolean result = false;
        int counter = 1;
        int lastDigit;
        int preLastDigit;
        while (counter < QUANTITY_OF_DIGITS) {
            lastDigit = value % 10;
            value /= 10;
            preLastDigit = value % 10;
            if (lastDigit > preLastDigit) {
                result = true;
            } else {
                result = false;
                break;
            }
            counter++;
        }
        return result;
    }

    public static boolean isDecreasingSequence(int value) {
        boolean result = false;
        int counter = 1;
        int lastDigit;
        int preLastDigit;
        while (counter < QUANTITY_OF_DIGITS) {
            lastDigit = value % 10;
            value /= 10;
            preLastDigit = value % 10;
            if (lastDigit < preLastDigit) {
                result = true;
            } else {
                result = false;
                break;
            }
            counter++;
        }
        return result;

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

    public static void isIncreasingOrDecreasingSequence(int value) {
        if (checkValue(value) == 0) {
            return;
        }
        if (isIncreasingSequence(value)) {
            System.out.println("Increasing sequence");
        } else if (isDecreasingSequence(value)) {
            System.out.println("Decreasing sequence");
        } else {
            System.out.println("Not sequence");
        }
    }

    private static int checkValue(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            System.out.println("Please, input " + QUANTITY_OF_DIGITS + " digits value");
            return 0;
        } else return 1;
    }
}
