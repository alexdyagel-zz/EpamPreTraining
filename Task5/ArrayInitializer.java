package by.dyagel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class ArrayInitializer {

    public static void randomInit(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void randomInit(double[] array, double min, double max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            double temp = min + (max - min) * random.nextDouble();
            array[i] = new BigDecimal(temp).setScale(2, RoundingMode.UP).doubleValue(); //rounding
        }
    }
}
