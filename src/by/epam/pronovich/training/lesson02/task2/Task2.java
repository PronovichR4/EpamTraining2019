package by.epam.pronovich.training.lesson02.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int ageOfDragon = inputNaturalValue();
        System.out.println(quantityEyesOfDragon(ageOfDragon));
        System.out.println(quantityHeadsOfDragon(ageOfDragon));
    }

    public static int quantityHeadsOfDragon(int age) {
        int heads = 3;
        int year = 1;
        while (year < age) {
            year++;
            if (year < 200) {
                heads = heads + 3;
            } else if (year >= 200 && year < 300) {
                heads = heads + 2;
            } else {
                heads = heads + 1;
            }
        }
        return heads;
    }

    public static int quantityEyesOfDragon(int age) {
        return quantityHeadsOfDragon(age) * 2;
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