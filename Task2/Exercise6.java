package by.dyagel;

public class Exercise6 {
    public static int makeReverse(int num) {
        int a1 = num / 1000000;
        int a2 = num / 100000 % 10;
        int a3 = num / 10000 % 10;
        int a4 = num / 1000 % 10;
        int a5 = num / 100 % 10;
        int a6 = num / 10 % 10;
        int a7 = num % 10;
        return (1000000 * a7 + 100000 * a6 + 10000 * a5 + 1000 * a4 + 100 * a3 + 10 * a2 + a1);
    }
}
