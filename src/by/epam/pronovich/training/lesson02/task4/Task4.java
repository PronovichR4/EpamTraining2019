package by.epam.pronovich.training.lesson02.task4;

public class Task4 {

    public static void main(String[] args) {
        shiftDay(28, 2, 2021);

    }

    public static boolean isLeapYear(int year) {
        boolean result;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void shiftDay(int day, int month, int year) {
        checkWrongDay(day, month, year);
        if ((month == 2 && !isLeapYear(year)) && day == 28) {
            month = 3;
            day = 1;
        } else if ((month == 2 && isLeapYear(year)) && day == 29) {
            month = 3;
            day = 1;
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            month++;
            day = 1;
        } else if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            month++;
            day = 1;
        } else if (month == 12 && day == 31) {
            month = 1;
            day = 1;
            year++;
        } else {
            day++;
        }
        System.out.println(day + "-" + month + "-" + year);
    }

    public static void checkWrongDay(int day, int month, int year) {
        if (month > 12 || month <= 0 || day <= 0 || year <= 0) {
            throw new IllegalArgumentException("Not correct date");
        } else if ((month == 2 && !isLeapYear(year)) && day > 28) {
            throw new IllegalArgumentException("Not correct date");
        } else if ((month == 2 && isLeapYear(year)) && day > 29) {
            throw new IllegalArgumentException("Not correct date");
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            throw new IllegalArgumentException("Not correct day");
        } else if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            throw new IllegalArgumentException("Not correct day");
        }

    }
}
