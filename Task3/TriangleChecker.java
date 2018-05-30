package by.dyagel;

public class TriangleChecker {

    /**
     * Check whether 3 points can be the tops of triangle
     * If they form triangle, check whether it is a right triangle
     */
    public static String checkThreePoints(int x1, int y1, int x2, int y2, int x3, int y3) {
        String result;
        double a = findLengthOfIntercept(x1, y1, x2, y2);
        double b = findLengthOfIntercept(x1, y1, x3, y3);
        double c = findLengthOfIntercept(x2, y2, x3, y3);

        if (isTriangle(a, b, c)) {
            if (isRightTriangle(a, b, c)) {
                result = "It is a right triangle";
            } else {
                result = "It is a not right triangle";
            }
        } else {
            result = "It is not a triangle";
        }
        return result;
    }

    /**
     * Returns length of intercept which is formed by 2 points
     */
    public static double findLengthOfIntercept(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * Check whether 3 intercepts form triangle
     */
    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    /**
     * Check whether triangle is right
     */
    public static boolean isRightTriangle(double a, double b, double c) {
        return ((a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a));
    }
}

