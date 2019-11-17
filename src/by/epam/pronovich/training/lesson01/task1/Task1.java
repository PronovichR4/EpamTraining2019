package by.epam.pronovich.training.lesson01.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int a = inputNaturalValue();
        int b = inputNaturalValue();
        int c = inputNaturalValue();
        System.out.println(isEqual(a, b, c));
    }

    public static boolean isEqual(int a, int b, int c) {
        boolean result = false;
        if (a == b && a == c) {
            result = true;
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
}
