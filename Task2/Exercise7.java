package by.dyagel;

public class Exercise7 {
    public static String swapTwoNumbers(int x, int y) {
        x = x + y;
        y = y - x;
        y = -y;
        x = x - y;
        return "x = " + x + " y= " + y;
    }
}
