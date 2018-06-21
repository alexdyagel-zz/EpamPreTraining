package by.epam.preTraining.alexdyagel.tasks.task10.model;

public class RecursionLogic {
    public static final long FIRST_FIBONACCI_NUMBER = 0;
    public static final long SECOND_FIBONACCI_NUMBER = 1;
    public static final long ERROR_VALUE = -1;

    public static long findSumOfDigits(long number) {
        if (number < 0) {
            number = -number;
        }
        if (number / 10 == 0) {
            return number;
        } else {
            long digit = number % 10; //find last digit
            number /= 10; // getting rid of last digit
            return digit + findSumOfDigits(number);
        }
    }

    public static double pow(double number, int power) throws NegativePowerException {
        if (power < 0) {
            throw new NegativePowerException("This method doesn't work with negative powers");
        }
        if (power == 0) {
            return 1;
        }
        if (power == 1 || number == 0) {
            return number;
        } else {
            return number * pow(number, power - 1);
        }
    }

    public static boolean equals(long number1, long number2) {
        if (number1 < 0 || number2 < 0) {
            return false;
        }
        if (number1 / 10 == 0) {
            return number1 == number2;
        } else {
            return equals(number1 / 10, number2 - number1 % 10);
        }
    }

    public static long findFibonacciNumber(int index) {
        if (index <= 0) {
            return ERROR_VALUE;
        }
        if (index == 1) {
            return FIRST_FIBONACCI_NUMBER;
        }
        if (index == 2) {
            return SECOND_FIBONACCI_NUMBER;
        } else {
            return findFibonacciNumber(index - 2) + findFibonacciNumber(index - 1);
        }
    }

    public static void solveHanoiTower(int circlesNumber, char from, char buff, char to) {
        if (circlesNumber <= 0) {
        } else {
            solveHanoiTower(circlesNumber - 1, from, to, buff);
            System.out.println(from + "-->" + to);
            solveHanoiTower(circlesNumber - 1, buff, from, to);
        }
    }

}
