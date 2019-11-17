package by.epam.pronovich.training.lesson01.task2;

import java.util.Scanner;

public class Task2 {

    private static final int KG_IN_TON = 1000;
    private static final int GRAMM_IN_KG = 1000;
    private static final int MILLIGRAM_IN_GRAMM = 1000;
    private static final int MILLIGRAM_IN_KG = GRAMM_IN_KG * MILLIGRAM_IN_GRAMM;


    public static void main(String[] args) {
        int veightOfDinosaurInKg = inputNaturalValue();

        double tonVeight = converWeightFromKgToTon(veightOfDinosaurInKg);
        long milligramVeight = converWeightFromKgToMilligram(veightOfDinosaurInKg);
        long grammVeight = converWeightFromKgToGramm(veightOfDinosaurInKg);

        System.out.println(tonVeight);
        System.out.println(milligramVeight);
        System.out.println(grammVeight);
    }

    public static double converWeightFromKgToTon(int weight) {
        return (double) weight / KG_IN_TON;
    }

    public static long converWeightFromKgToMilligram(int weight) {
        return (long) weight * MILLIGRAM_IN_KG;
    }

    public static long converWeightFromKgToGramm(int weight) {
        return (long) weight * GRAMM_IN_KG;
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
