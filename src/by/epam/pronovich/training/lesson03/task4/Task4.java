package by.epam.pronovich.training.lesson03.task4;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

public class Task4 {

    public static void main(String[] args) {
        int startFrom = UtillClass.inputNaturalValue();
        int endTo = UtillClass.inputNaturalValue();
        findFrindlyNumber(startFrom, endTo);
    }

    public static void findFrindlyNumber(int from, int to) {
        for (int i = from; i < to; i++) {
            int comparingNumber = calculateSummOfDelimeters(i);
            for (int j = i + 1; j <= to; j++) {
                if (comparingNumber == j) {
                    System.out.println(i + "  " + j);
                }
            }
        }
    }

    public static int calculateSummOfDelimeters(int value) {
        int result = 0;
        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
