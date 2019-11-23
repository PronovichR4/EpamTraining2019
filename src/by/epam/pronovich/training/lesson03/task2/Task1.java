package by.epam.pronovich.training.lesson03.task2;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int value = UtillClass.inputAnyIntValue();
        System.out.println(findMaxDigitOfNumber(value));
    }

    private static int findMaxDigitOfNumber(int value) {
        value = Math.abs(value);
        int maxDigit = 0;
        int tempDigit;
        while (value != 0) {
            tempDigit = value % 10;
            if (tempDigit > maxDigit) {
                maxDigit = tempDigit;
            }
            value /= 10;
        }
        return maxDigit;
    }
}
