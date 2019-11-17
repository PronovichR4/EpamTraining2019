package by.epam.pronovich.training.lesson01.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int firstRadius = inputNaturalValue();
        int secondRadius = inputNaturalValue();
        System.out.println(findAreaFromTwoCirlce(firstRadius, secondRadius));
    }

    public static double findAreaCircle(int radius) {
        return Math.PI * Math.pow((double) radius, 2);
    }

    public static double findAreaFromTwoCirlce(int firstRadius, int secondRadius) {
        double result = 0;
        if (checkValue(firstRadius, secondRadius) == 0) {
            return result;
        }
        result = findAreaCircle(firstRadius) - findAreaCircle(secondRadius);
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

    private static int checkValue(int firstValue, int secondValue) {
        if (firstValue <= secondValue) {
            System.out.println("Please, input valid value, first radius must be more than second radius");
            return 0;
        } else return 1;
    }
}
