package by.epam.pronovich.training.lesson03.task2;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int value = UtillClass.inputAnyIntValue();
        System.out.println(getDigitByIndexFromTail(value, 1));
        System.out.println(calculateQuantityOfDigits(value));
        System.out.println(isPolindrom(value));
    }

    public static boolean isPolindrom(int value) {
        boolean result = true;
        int quantityOfDigits = calculateQuantityOfDigits(value);
        for (int i = 1, k = 0; i <= quantityOfDigits / 2; i++, k++) {
            if (getDigitByIndexFromTail(value, i) != getDigitByIndexFromTail(value, quantityOfDigits - k)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int calculateQuantityOfDigits(int value) {
        int result = 0;
        while (value != 0) {
            value /= 10;
            result++;
        }
        return result;
    }

    public static int getDigitByIndexFromTail(int value, int indexFromTail) {
        value = Math.abs(value);
        int result = 0;
        if (indexFromTail == 1) {
            result = value % 10;
        } else {
            result = (int) (value / Math.pow(10, indexFromTail - 1) % 10);
        }
        return result;
    }


}
