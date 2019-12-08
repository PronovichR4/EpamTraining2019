package by.epam.pronovich.training.classwork;

public class Task1 {

    public static void main(String[] args) {
        double[] array = {-1, -1, 1, 1};
        System.out.println(findIndexOfMaxElemByModul(array));
        System.out.println(findIndOfFirstPosElemInArray(array));
        calculateSummOfElemAfterPosValue(array);
    }

    private static int findIndexOfMaxElemByModul(double[] array) {
        int result = -1;
        double maxElement = Math.abs(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) > maxElement) {
                maxElement = Math.abs(array[i]);
                result = i;
            }
        }
        return result;
    }

    private static int findIndOfFirstPosElemInArray(double[] array) {
        int result = -1;
        double firstPosElem = -1;
        int counter = 0;
        while (firstPosElem < 0 && counter < array.length) {
            firstPosElem = array[counter];
            if (firstPosElem >= 0) {
                result = counter;
            }
            counter = counter + 1;
        }
        return result;
    }

    public static boolean checkIndex(int index, double[] array) {
        boolean result = true;
        if (index < 0 || index >= array.length - 1) {
            result = false;
        }
        return result;
    }

    public static void calculateSummOfElemAfterPosValue(double[] array) {
        double sum = 0;
        int indOfFirstPosElem = findIndOfFirstPosElemInArray(array);
        if (checkIndex(indOfFirstPosElem, array)) {
            for (int i = indOfFirstPosElem + 1; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);
        }
    }
}

