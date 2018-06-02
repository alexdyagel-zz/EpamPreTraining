package by.dyagel;

import java.util.Random;

public class HeadsOrTails {

    public static String headsAndTailsChecker(int throwsNumber) {
        String result;
        int heads = 0;
        int tails = 0;
        boolean throwing;
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < throwsNumber; i++) {
            throwing = random.nextBoolean(); //if true - its a head, false - its a tail
            if (throwing) {
                heads++;
            } else {
                tails++;
            }
        }
        result = "Number of heads: " + heads + " \nNumber of tails: " + tails;
        return result;
    }
}
