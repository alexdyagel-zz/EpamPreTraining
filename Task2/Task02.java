package by.dyagel;

public class Task02 {
    public static void main(String[] args) {
        //exercise 1
        System.out.println("exercise 1");
        int a = 5, b = 5, c = 5;
        boolean res = Exercise1.areEqual(a, b, c);
        System.out.printf("numbers %d %d %d are equal: %b\n", a, b, c, res);

        //exercise 2
        System.out.println("\nexercise 2");
        double kg = 5000.55;
        double gr, mg, tons;
        gr = Exercise2.convertToGrams(kg);
        mg = Exercise2.convertToMilligrams(kg);
        tons = Exercise2.convertToTons(kg);
        System.out.printf("Mas of dinosaur:\nkilograms: %.2f\ngrams: %.2f\nmilligrams: %.2f\ntons: %f\n", kg, gr, mg, tons);

        //exercise 3
        System.out.println("\nexercise 3");
        double r1 = 5, r2 = 3.5;
        double square = Exercise3.findRingSquare(r1, r2);
        System.out.printf("Radius 1 - %.2f\nRadius 2 - %.2f\nSquare of ring - %.2f", r1, r2, square);

        //exercise 4
        System.out.println("\nexercise 4");
        int number1 = 1234;
        int number2 = 4444;
        boolean res1 = Exercise4.isIncreasingProgression(number1);
        boolean res2 = Exercise4.isIncreasingProgression(number2);
        System.out.printf("Digits of number %d form an increasing progression --> %b\n", number1, res1);
        System.out.printf("Digits of number %d form an increasing progression --> %b\n", number2, res2);

        //exercise 5
        System.out.println("\nexercise 5");
        int num = 123456;
        double avG = Exercise5.averageGeometric(num);
        double avA = Exercise5.averageArithmetic(num);
        System.out.printf("Average geometric of digits of number %d : %.2f\n", num, avG);
        System.out.printf("Average arithmetic of digits of number %d : %.2f\n", num, avA);

        //exercise 6
        System.out.println("\nexercise 6");
        int n = 1234567;
        int n1 = Exercise6.makeReverse(n);
        System.out.printf("Reverse of number %d ==> %d", n, n1);

        //exercise 7
        System.out.println("\nexercise 7");
        int x = 5, y = 11;
        String result = Exercise7.swapTwoNumbers(x, y);
        System.out.printf("x = %d y = %d ===> %s", x, y, result);
    }
}
