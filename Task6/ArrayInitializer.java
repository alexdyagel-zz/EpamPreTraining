package com.epam.alexdyagel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class ArrayInitializer {

    public static void randomInit(double[][] array, double min, double max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                double temp = min + (max - min) * random.nextDouble();
                array[i][j] = new BigDecimal(temp).setScale(2, RoundingMode.UP).doubleValue(); //rounding
            }
        }
    }
}
