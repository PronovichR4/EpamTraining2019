package by.epam.pronovich.training.lesson02.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int x1 = inputNaturalValue();
        int x2 = inputNaturalValue();
        int x3 = inputNaturalValue();
        int y1 = inputNaturalValue();
        int y2 = inputNaturalValue();
        int y3 = inputNaturalValue();

        System.out.println(isRectangle(x1,x2,x3,y1,y2,y3));
        System.out.println(isRectangleTriangular(x1,x2,x3,y1,y2,y3));

    }

    public static boolean isRectangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        boolean result;
        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean isRectangleTriangular(int x1, int x2, int x3, int y1, int y2, int y3) {
        boolean result;
        if ((Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2) + Math.pow((x2 - x3), 2) + Math.pow(y2 - y3, 2) ==
                Math.pow((x3 - x1), 2) + Math.pow(y3 - y1, 2)) ||
                (Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2) + Math.pow((x3 - x1), 2) + Math.pow(y3 - y1, 2) ==
                        Math.pow((x2 - x3), 2) + Math.pow(y2 - y3, 2)) ||
                (Math.pow((x3 - x1), 2) + Math.pow(y3 - y1, 2) + Math.pow((x3 - x2), 2) + Math.pow(y3 - y2, 2) ==
                        Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2))
                ) {
            result = true;
        } else {
            result = false;
        }
        return result;
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
