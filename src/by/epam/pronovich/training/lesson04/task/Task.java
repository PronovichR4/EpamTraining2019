package by.epam.pronovich.training.lesson04.task;

public final class Task {

    private Task() {
    }

    public static void transponirArray(double[][] array) {
        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public static void findLocalMinPosition(double[][] array) {
        boolean isHaveLocalMin = false;
        outer:
        for (int i = 0; i < array.length; i++) {
            for (int j = 1, previousValue = j - 1, nextValue = j + 1; j < array[i].length - 1; j++) {
                if (array[i][j] < array[i][previousValue] && array[i][j] < array[i][nextValue]) {
                    System.out.println("Position of local minimum in array is: " + i + " " + j);
                    isHaveLocalMin = true;
                    break outer;
                }
            }
        }
        if (!isHaveLocalMin) {
            System.out.println(-1);
        }
    }

    public static void findLocalMaxPosition(double[][] array) {
        boolean isHaveLocalMin = false;
        outer:
        for (int i = 0; i < array.length; i++) {
            for (int j = 1, previousValue = j - 1, nextValue = j + 1; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i][previousValue] && array[i][j] > array[i][nextValue]) {
                    System.out.println("Position of local maximum in array is: " + i + " " + j);
                    isHaveLocalMin = true;
                    break outer;
                }
            }
        }
        if (!isHaveLocalMin) {
            System.out.println(-1);
        }
    }

    public static double calculateArithmeticMean(double[][] array) {
        double sum = 0;
        int quantityOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                quantityOfElements++;
            }
        }
        return sum / quantityOfElements;
    }

    public static double calculateGeometricMean(double[][] array) {
        double multiplication = 1;
        int quantityOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                multiplication = multiplication * array[i][j];
                quantityOfElements++;
            }
        }
        return Math.pow(multiplication, 1.0 / quantityOfElements);
    }

    public static double findMinValue(double[][] array) {
        double result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < result) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    public static double findMaxValue(double[][] array) {
        double result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }
}
