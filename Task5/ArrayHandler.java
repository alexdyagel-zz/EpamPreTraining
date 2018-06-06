package by.dyagel;

/**
 * The class contains methods for performing different operations with arrays
 */
public class ArrayHandler {

    /**
     * This method finds out max value of array
     *
     * @param array array of floating-point numbers
     * @return max value of array
     */
    public static double findMaxValueOfArray(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * This method finds out min value of array
     *
     * @param array array of floating-point numbers
     * @return min value of array
     */
    public static double findMinValueOfArray(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * This method finds out geometric mean of numbers in array
     * Special case: if array contains negative numbers, method returns -1
     *
     * @param array array of floating-point numbers
     * @return geometric mean of array of numbers
     */
    public static double findGeometricMean(double[] array) {
        double res = -1;
        if (!containsNegativeValue(array)) {
            res = Math.pow(getMultiplicationOfArray(array), 1.0 / array.length);
        }
        return res;
    }

    /**
     * This method finds out arithmetic mean of numbers in array
     *
     * @param array array of floating-point numbers
     * @return arithmetic mean of array of numbers
     */
    public static double findArithmeticMean(double[] array) {
        return getSumOfArray(array) / array.length;
    }

    /**
     * Check whether array contains negative number
     *
     * @param array array of floating-point numbers
     * @return true if array contains negative number, false - if doesn't
     */
    public static boolean containsNegativeValue(double[] array) {
        for (double arrayValue : array) {
            if (arrayValue < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method finds out multiplication of numbers in array
     *
     * @param array array of floating-point numbers
     * @return result of multiplication of array values
     */
    public static double getMultiplicationOfArray(double[] array) {
        double mult = 1;
        for (double arrayValue : array) {
            mult *= arrayValue;
        }
        return mult;
    }

    /**
     * This method finds out sum of numbers in array
     *
     * @param array array of floating-point numbers
     * @return result of sum of array values
     */
    public static double getSumOfArray(double[] array) {
        double sum = 0;
        for (double arrayValue : array) {
            sum += arrayValue;
        }
        return sum;
    }


    /**
     * Method checks whether array is sorted in any direction
     *
     * @param array array of floating-point numbers
     * @return true if array is sorted, false - if doesn't
     */
    public static boolean isSortedArray(double[] array) {
        return isDecreaseSortedArray(array) || isIncreaseSortedArray(array);
    }

    /**
     * Method checks whether array is sorted in increasing order
     * Special case: if length of array is 0 method returns false
     *
     * @param array array of floating-point numbers
     * @return true if array is sorted, false - if doesn't
     */
    public static boolean isIncreaseSortedArray(double[] array) {
        if (array.length == 0) {
            return false;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method checks whether array is sorted in decreasing order
     * Special case: if length of array is 0 method returns false
     *
     * @param array array of floating-point numbers
     * @return true if array is sorted, false - if doesn't
     */
    public static boolean isDecreaseSortedArray(double[] array) {
        if (array.length == 0) {
            return false;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method finds out index of first local minimum in array
     * Special case: if there are no local minimum in array method returns -1
     *
     * @param array array of floating-point numbers
     * @return index of local minimum or -1, if there is no local minimum
     */
    public static int getIndexOfLocalMinimum(double[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Method finds out index of first local maximum in array
     * Special case: if there are no local maximum in array method returns -1
     *
     * @param array array of floating-point numbers
     * @return index of local maximum or -1, if there is no local maximum
     */
    public static int getIndexOfLocalMaximum(double[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Method reverses array
     *
     * @param array array of floating-point numbers
     */
    public static void reverseArray(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] - array[array.length - i - 1];
            array[array.length - i - 1] = array[i] + array[array.length - i - 1];
            array[i] = array[array.length - i - 1] - array[i];
        }
    }

    /**
     * Method reverses array using binary XOR
     *
     * @param array array of integer numbers
     */
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] ^ array[array.length - i - 1];
            array[array.length - i - 1] = array[i] ^ array[array.length - i - 1];
            array[i] = array[i] ^ array[array.length - i - 1];
        }
    }
}
