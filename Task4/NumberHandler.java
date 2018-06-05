package by.dyagel;

public class NumberHandler {

    private static final int MAX_DIGIT = 9;

    public static int findMaxDigitOfNumber(int number) {
        number = Math.abs(number); // getting rid of negative number
        int maxDigit = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;        // finds out the last digit of number
            if (maxDigit < digit) {     // compare found digit with max digit
                maxDigit = digit;       // if found digit larger than max,
            }                           // digit is becoming max
            number /= 10;               // here we are getting rid of last digit
        }
        return maxDigit;
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number); // getting rid of negative number
        int numberCopy = number;   // copy of number to save its value
        int reverseNumber = 0;
        while (number > 0) {       /* here we find out reverse of entered number*/
            reverseNumber *= 10;
            reverseNumber += (number % 10);
            number /= 10;
        }
        return reverseNumber == numberCopy; //check if reverse is equal to initial value
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number == 1) {
            result = false;
        }
        // even numbers except 2 are not prime
        if (number % 2 == 0 && number != 2) {
            result = false;
        }
        // check dividers from 2 to square root of number
        for (int divider = 2; divider <= Math.sqrt(number); divider++) {
            //if number has a divider in this interval, it is not a prime number
            if (number % divider == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String findPrimeDividers(int number) {
        number = Math.abs(number); // getting rid of negative number
        String result = "";
        for (int divider = 1; divider <= number; divider++) {
            if ((number % divider == 0) && isPrime(divider)) {
                result += (divider + " ");
            }
        }
        return result.equals("") ? "no prime dividers" : result;
    }

    /**
     * Method finds out greatest common divisor
     * using Euclidean algorithm
     */
    public static int findGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    /**
     * Method finds out least common multiple
     * using relations with GCD
     */
    public static int findLCM(int a, int b) {
        return a * b / findGCD(a, b);
    }

    public static int findAmountOfDifferentDigits(int number) {
        int count = 0;

        int numberKeeper;
        for (int digit = 0; digit <= MAX_DIGIT; digit++) {
            numberKeeper = number;
            while (numberKeeper > 0) {
                if (numberKeeper % 10 == digit) {
                    count++;
                    break;
                }
                numberKeeper /= 10;
            }
        }
        return count;
    }
}
