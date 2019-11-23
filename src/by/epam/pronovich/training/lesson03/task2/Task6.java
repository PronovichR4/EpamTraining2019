package by.epam.pronovich.training.lesson03.task2;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

public class Task6 {

    public static void main(String[] args) {
        int value = UtillClass.inputNaturalValue();
        System.out.println(quantityOfDiferentDigits(value));
    }

    public static int quantityOfDiferentDigits(int value) {
        int quantityOfDigits = calculateQuantityOfDigits(value);
        int counter = 0;
        int digitForCheack = 0;
        int otherDigit = 0;
        int unique = 0;
        for (int i = 1; i <= quantityOfDigits; i++) {
            digitForCheack = getDigitByIndexFromTail(value, i);
            for (int j = i + 1; j <= quantityOfDigits; j++) {
                otherDigit = getDigitByIndexFromTail(value, j);
                if (digitForCheack == otherDigit) {
                    counter++;
                }
            }
            if (counter == 0) {
                unique++;
            }
            counter = 0;
        }
        return unique;
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
