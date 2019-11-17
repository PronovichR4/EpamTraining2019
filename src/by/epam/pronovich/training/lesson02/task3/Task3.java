package by.epam.pronovich.training.lesson02.task3;

import java.util.Scanner;

public class Task3 {

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) {
        char letter = inputCharacter();
        System.out.println(isVowelsVersion1(letter));
        System.out.println(isVowelsVersion2(letter));
        System.out.println(isVowelsVersion3(letter));
    }

    public static boolean isVowelsVersion1(char letter) {
        boolean result = false;
        for (int i = 0; i < VOWELS.length; i++) {
            if (letter == VOWELS[i] || letter == Character.toUpperCase(VOWELS[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isVowelsVersion2(char letter) {
        letter = Character.toLowerCase(letter);
        boolean result;
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }

    public static boolean isVowelsVersion3(char letter) {
        boolean result;
        letter = Character.toLowerCase(letter);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static char inputCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">");
        return scanner.next().charAt(0);
    }
}