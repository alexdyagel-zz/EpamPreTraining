package by.dyagel;

public class Exercise5 {
    public static double averageArithmetic(int num) {
        int a1 = num / 100000;
        int a2 = num / 10000 % 10;
        int a3 = num / 1000 % 10;
        int a4 = num / 100 % 10;
        int a5 = num / 10 % 10;
        int a6 = num % 10;
        return (double) (a1 + a2 + a3 + a4 + a5 + a6) / 6;
    }

    public static double averageGeometric(int num) {
        int a1 = num / 100000;
        int a2 = num / 10000 % 10;
        int a3 = num / 1000 % 10;
        int a4 = num / 100 % 10;
        int a5 = num / 10 % 10;
        int a6 = num % 10;
        return Math.pow(a1 * a2 * a3 * a4 * a5 * a6, 1.0 / 6);
    }
}
