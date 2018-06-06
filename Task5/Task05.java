package by.dyagel;

import java.util.Arrays;

public class Task05 {

    public static void main(String[] args) {
        //working with double array
        double[] array = new double[5];
        ArrayInitializer.randomInit(array, 5, 10);
        System.out.printf("Array: %s\n", Arrays.toString(array));
        System.out.printf("Min value of array : %.2f\n", ArrayHandler.findMinValueOfArray(array));
        System.out.printf("Max value of array : %.2f\n", ArrayHandler.findMaxValueOfArray(array));
        System.out.printf("Arithmetic mean of array: %.2f\n", ArrayHandler.findArithmeticMean(array));
        System.out.printf("Geometric mean of array: %.2f\n", ArrayHandler.findGeometricMean(array));
        System.out.printf("Array is sorted ==> %b\n", ArrayHandler.isSortedArray(array));
        System.out.printf("Index of local minimum : %d\n", ArrayHandler.getIndexOfLocalMinimum(array));
        System.out.printf("Index of local maximum : %d\n", ArrayHandler.getIndexOfLocalMaximum(array));
        ArrayHandler.reverseArray(array);
        System.out.printf("Array after reverse: %s\n", Arrays.toString(array));

        //showing reverse of int array
        int[] array1 = new int[5];
        ArrayInitializer.randomInit(array1, 5, 25);
        System.out.printf("Array: %s\n", Arrays.toString(array1));
        ArrayHandler.reverseArray(array1);
        System.out.printf("Array after reverse: %s", Arrays.toString(array1));

    }
}
