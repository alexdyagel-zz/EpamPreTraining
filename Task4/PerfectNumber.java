package by.dyagel;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        int dividersSum = 0;
        for (int divider = 1; divider <= number / 2; divider++) {
            if (number % divider == 0) {
                dividersSum += divider;
            }
        }
        if (dividersSum == number) {
            return true;
        } else {
            return false;
        }
    }
}
