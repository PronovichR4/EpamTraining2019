package by.epam.pronovich.training.lesson01.task7;

public class Task7 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        changeValue(a, b);
    }

    public static void changeValue(int a, int b) {
        a = (a ^ b);
        b = (a ^ b);
        a = (a ^ b);
        System.out.println("a=" + a + "  " + "b=" + b);
    }
}
