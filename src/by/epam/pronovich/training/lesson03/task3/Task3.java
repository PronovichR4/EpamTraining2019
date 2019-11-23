package by.epam.pronovich.training.lesson03.task3;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

public class Task3 {

    public static void main(String[] args) {
        int value = UtillClass.inputNaturalValue();
        System.out.println(isPerfectNumber(value));
    }

    public static boolean isPerfectNumber(int value) {
        boolean result = false;
        int sum = 0;
        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                sum = sum + i;
            }
            if (sum == value) {
                result = true;
            }
        }
        return result;
    }
}
