package by.epam.pronovich.training.lesson03.utill;

import java.util.Scanner;

public final class UtillClass {

    private UtillClass() {
    }

    public static int inputNaturalValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">");
        int result = 0;
        while (result < 1) {
            while (!scanner.hasNextInt()) {
                System.out.println(">");
                scanner.next();
            }
            result = scanner.nextInt();
        }
        return result;
    }

    public static int inputAnyIntValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">");
        while (!scanner.hasNextInt()) {
            System.out.println(">");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
