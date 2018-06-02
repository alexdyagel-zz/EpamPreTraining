package by.dyagel;

public class TaskTester {

    public static void main(String[] args) {

        //exercise 1
        System.out.println("EXERCISE 1");
        int throwsNumber = 1000;
        System.out.printf("Number of throws: %d\n", throwsNumber);
        System.out.println(HeadsOrTails.headsAndTailsChecker(throwsNumber));

        //exercise 2
        System.out.println("\nEXERCISE 2");
        // point 1
        int number = 12387569;
        System.out.printf("Max digit of number %d - %d\n", number, NumberHandler.findMaxDigitOfNumber(number));
        //point 2
        number = 7775777;
        System.out.printf("Number %d is palindrome ==> %b\n", number, NumberHandler.isPalindrome(number));
        //point 3
        number = 1;
        System.out.printf("Number %d is prime ==> %b\n", number, NumberHandler.isPrime(number));
        //point 4
        number = 29;
        System.out.printf("Prime dividers of number %d: %s\n", number, NumberHandler.findPrimeDividers(number));
        //point 5
        int a = 1000023;
        int b = 12;
        System.out.printf("GCD of numbers %d and %d - %d\n", a, b, NumberHandler.findGCD(a, b));
        System.out.printf("LCM of numbers %d and %d - %d\n", a, b, NumberHandler.findLCM(a, b));
        //point 6
        number = 1234567890;
        System.out.printf("Amount of different digits of number %d: %d\n", number, NumberHandler.findAmountOfDifferentDigits(number));

        //exercise 3
        System.out.println("\nEXERCISE 3");
        number = 8128;
        System.out.printf("Number %d is perfect ==> %b", number, PerfectNumber.isPerfect(number));
    }
}
