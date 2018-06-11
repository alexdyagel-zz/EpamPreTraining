package com.epam.alexdyagel;

import java.util.Arrays;

public class Task06 {

    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        double[][] array = new double[n][m];
        ArrayInitializer.randomInit(array, 0, 5);   // random initialization of array
        for (double internalArray[] : array) {
            System.out.println(Arrays.toString(internalArray));
        }
        System.out.printf("Max value of array : %.2f\n", MultidimensionalArray.findMaxValueOfArray(array));
        System.out.printf("Min value of array : %.2f\n", MultidimensionalArray.findMinValueOfArray(array));
        System.out.printf("Arithmetic mean of array: %.2f\n", MultidimensionalArray.findArithmeticMean(array));
        System.out.printf("Geometric mean of array: %.2f\n", MultidimensionalArray.findGeometricMean(array));
        System.out.printf("Indexes of local minimum: %s\n", Arrays.toString(MultidimensionalArray.getIndexesOfLocalMinimum(array)));
        System.out.printf("Indexes of local maximum: %s\n", Arrays.toString(MultidimensionalArray.getIndexesOfLocalMaximum(array)));
        if (MultidimensionalArray.transpose(array)) {
            System.out.println("Transported matrix: ");
            for (double internalArray[] : array) {
                System.out.println(Arrays.toString(internalArray));
            }
        } else{
            System.out.println("matrix isn't square, so it cant be transposed");
        }


    }
}
