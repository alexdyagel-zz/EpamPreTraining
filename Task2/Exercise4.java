package by.dyagel;

public class Exercise4 {
    public static boolean isIncreasingProgression(int number) {
        int a1 = number / 1000;
        int a2 = number / 100 % 10;
        int a3 = number / 10 % 10;
        int a4 = number % 10;
        return (a1 < a2) && (a2 < a3) && (a3 < a4);
    }
}
