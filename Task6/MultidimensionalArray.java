package com.epam.alexdyagel;

public class MultidimensionalArray {

    private static final int DEFAULT_MULTIPLICATION_VALUE = 1;
    private static final int DEFAULT_SUM_VALUE = 0;
    private static final int ERROR_VALUE = -1;
    private static final int[] ERROR_INDEXES_OF_ARRAY = {-1, -1};
    private static final int MIN_SIZE_OF_ARRAY_FOR_LOCAL_MINIMUM = 3;
    private static final int SECOND_ELEMENT_OF_ARRAY = 1;


    public static double findMaxValueOfArray(double[][] array) {
        double max;
        if (isEmpty(array)) {
            max = Double.NaN;
        } else {
            max = array[0][0];
            for (double internalArray[] : array) {
                for (double element : internalArray) {
                    if (max < element) {
                        max = element;
                    }
                }
            }
        }
        return max;
    }

    public static double findMinValueOfArray(double[][] array) {
        double min;
        if (isEmpty(array)) {
            min = Double.NaN;
        } else {
            min = array[0][0];
            for (double internalArray[] : array) {
                for (double element : internalArray) {
                    if (min > element) {
                        min = element;
                    }
                }
            }
        }
        return min;
    }

    public static double findGeometricMean(double[][] array) {
        double res = ERROR_VALUE;
        if (!isEmpty(array) && !containsNegativeValue(array)) {
            res = Math.pow(getMultiplicationOfArray(array), 1.0 / (array.length * array[0].length));
        }
        return res;
    }

    public static double findArithmeticMean(double[][] array) {
        return !isEmpty(array) ? (getSumOfArray(array) / (array.length * array[0].length)) : Double.NaN;
    }


    public static boolean containsNegativeValue(double[][] array) {
        for (double internalArray[] : array) {
            for (double element : internalArray) {
                if (element < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double getMultiplicationOfArray(double[][] array) {
        double mult = DEFAULT_MULTIPLICATION_VALUE;
        for (double internalArray[] : array) {
            for (double element : internalArray) {
                mult *= element;
            }
        }
        return mult;
    }

    public static double getSumOfArray(double[][] array) {
        double sum = DEFAULT_SUM_VALUE;
        for (double internalArray[] : array) {
            for (double element : internalArray) {
                sum += element;
            }
        }
        return sum;
    }

    /**
     * This method finds out indexes of local minimum
     */
    public static int[] getIndexesOfLocalMinimum(double[][] array) {
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (isLocalMinimum(array, i, j)) {
                    return new int[]{i, j};
                }
            }
        }
        return ERROR_INDEXES_OF_ARRAY;
    }

    /**
     * This method checks indexes of array, whether they are indexes of local minimum
     * Array's size should be not less than 3x3
     * Value should be "inside" of array and have 8 neighbours
     */
    private static boolean isLocalMinimum(double[][] array, int indI, int indJ) {
        // local minimum in TwoDimensional array should have 8 neighbours
        //at first check size and indexes
        //if size and indexes are legal, compare value with all neighbour's values
        return areValidConditionsForExtremum(array, indI, indJ)
                && array[indI][indJ] < array[indI - 1][indJ]
                && array[indI][indJ] < array[indI + 1][indJ]
                && array[indI][indJ] < array[indI][indJ - 1]
                && array[indI][indJ] < array[indI][indJ + 1]
                && array[indI][indJ] < array[indI - 1][indJ - 1]
                && array[indI][indJ] < array[indI + 1][indJ + 1]
                && array[indI][indJ] < array[indI - 1][indJ + 1]
                && array[indI][indJ] < array[indI + 1][indJ - 1];
    }

    /**
     * This method finds out indexes of local maximum
     */
    public static int[] getIndexesOfLocalMaximum(double[][] array) {
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (isLocalMaximum(array, i, j)) {
                    return new int[]{i, j};
                }
            }
        }
        return ERROR_INDEXES_OF_ARRAY;
    }

    /**
     * This method checks indexes of array, whether they are indexes of local maximum
     * Array's size should be not less than 3x3
     * Value should be "inside" of array and have 8 neighbours
     */
    private static boolean isLocalMaximum(double[][] array, int indI, int indJ) {
        // local maximum in TwoDimensional array should have 8 neighbours
        //at first check size and indexes
        //if size and indexes are legal, compare value with all neighbour's values
        return areValidConditionsForExtremum(array, indI, indJ)
                && array[indI][indJ] > array[indI - 1][indJ]
                && array[indI][indJ] > array[indI + 1][indJ]
                && array[indI][indJ] > array[indI][indJ - 1]
                && array[indI][indJ] > array[indI][indJ + 1]
                && array[indI][indJ] > array[indI - 1][indJ - 1]
                && array[indI][indJ] > array[indI + 1][indJ + 1]
                && array[indI][indJ] > array[indI - 1][indJ + 1]
                && array[indI][indJ] > array[indI + 1][indJ - 1];
    }

    /**
     * The method checks, whether conditions for extremum in two-dimensional array are valid:
     * size of array shouldn't be less than 3x3 and values shouldn't be on the "border" of array
     */
    public static boolean areValidConditionsForExtremum(double[][] array, int indI, int indJ) {
        return array.length >= MIN_SIZE_OF_ARRAY_FOR_LOCAL_MINIMUM
                && array[0].length >= MIN_SIZE_OF_ARRAY_FOR_LOCAL_MINIMUM
                && indI >= SECOND_ELEMENT_OF_ARRAY
                && indJ >= SECOND_ELEMENT_OF_ARRAY
                && indI < array.length - 1
                && indJ < array[indI].length - 1;
    }

    /**
     * Method transpose matrix
     * Additional storage is used here because method can transpose either square and not square matrix
     */
    public static double[][] transpose(double[][] array) {
        if (!isEmpty(array)) {
            if (isSquare(array)) {
                for (int i = 1; i < array.length; i++) {
                    for (int j = 0; j < i; j++) {
                        array[i][j] = array[i][j] - array[j][i];
                        array[j][i] = array[i][j] + array[j][i];
                        array[i][j] = array[j][i] - array[i][j];
                    }
                }
            } else {
                double[][] arrayTemp = new double[array[0].length][array.length];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[0].length; j++) {
                        arrayTemp[j][i] = array[i][j];
                    }
                }
                return arrayTemp;
            }
        }
        return array;
    }

    /**
     * This method checks whether array is square
     */
    private static boolean isSquare(double[][] array) {
        return !isEmpty(array) && (array.length == array[0].length);
    }

    /**
     * This method checks, whether array is empty or not
     */
    public static boolean isEmpty(double[][] array) {
        return (array.length == 0) || (array[0].length == 0);
    }
}
