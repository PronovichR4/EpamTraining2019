package by.epam.pronovich.training.lesson01.task6;

import java.util.Scanner;

public class Task6 {

    private static final int QUANTITY_OF_DIGITS = 7;
    private static final int MIN_VALUE = 1000000;
    private static final int MAX_VALUE = 9999999;

    public static void main(String[] args) {
        int testValue = inputNaturalValue();
        System.out.println(reverseValue(testValue));
    }

    public static int reverseValue(int value) {
        if (checkValue(value) == 0) {
            return 0;
        }
        String result = String.valueOf(value);
        result = new StringBuilder(result).reverse().toString();
        return Integer.parseInt(result);
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
