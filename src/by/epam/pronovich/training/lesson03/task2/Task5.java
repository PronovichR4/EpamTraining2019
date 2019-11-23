package by.epam.pronovich.training.lesson03.task2;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

public class Task5 {

    public static void main(String[] args) {
        int a = UtillClass.inputNaturalValue();
        int b = UtillClass.inputNaturalValue();
        System.out.println(calculateNOD(a, b));
        System.out.println(calculateNOK(a, b));
    }

    public static int calculateNOD(int firstValue, int secondValue) {
        int temp;
        while (secondValue != 0) {
            temp = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = temp;
        }
        return firstValue;
    }

    public static int calculateNOK(int firstValue, int secondValue) {
        int nod = calculateNOD(firstValue, secondValue);
        return (firstValue * secondValue) / nod;
    }
}
