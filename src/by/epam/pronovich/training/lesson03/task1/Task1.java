package by.epam.pronovich.training.lesson03.task1;

import java.util.Random;

public class Task1 {

    private static final int NUMBER_OF_THROWS = 1000;

    public static void main(String[] args) {
        calculateHeadsOrTails();
    }

    private static void calculateHeadsOrTails() {
        Random random = new Random();
        int heads = 0;
        int tails = 0;
        int result;
        for (int i = 0; i < NUMBER_OF_THROWS; i++) {
            result = random.nextInt(2);
            {
                if (result == 0) {
                    heads++;
                } else {
                    tails++;
                }
            }
        }
        System.out.println("Heads: " + heads + " Tails: " + tails);
    }
}
