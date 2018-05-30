package by.dyagel;

public class TaskTester {
    public static void main(String[] args) {

        //exercise 1
        System.out.printf("EXERCISE 1\nThe program check whether three points form triangle\n");
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 4;
        int x3 = 3, y3 = 0;
        String result = TriangleChecker.checkThreePoints(x1, y1, x2, y2, x3, y3);
        System.out.printf("The coordinates: (%d,%d),(%d,%d),(%d,%d)\n", x1, y1, x2, y2, x3, y3);
        System.out.printf(result + "\n");

        //exercise 2
        System.out.printf("\n\nEXERCISE 2\nThe program finds how much heads and eyes dragon has\n");
        int age = 500;
        int headsNumber = Dragon.getHeadsNumber(age);
        int eyesNumber = Dragon.getEyesNumber(headsNumber);
        System.out.printf("Age of dragon: %d\nNumber of heads: %d\nNumber of eyes: %d\n", age, headsNumber, eyesNumber);

        //exercise 3
        System.out.printf("\n\nEXERCISE 3\nThe program checks whether letter is vowel\n");
        char letter1 = 'A';
        System.out.printf("letter '%c' is vowel ==> %b \n", letter1, LetterChecker.isVowel4(letter1));

        //exercise 4
        System.out.printf("\n\nEXERCISE 4\nThe program guesses your mood\n");
        System.out.printf("Your mood is: %s", MoodSensor.getUsersMood());

        //exercise 5
        System.out.printf("\n\nEXERCISE 5\nThe program finds the next day after entered date\n");
        int day = 28;
        int month = 2;
        int year = 1601;
        System.out.printf("The date : %d.%d.%d \nThe next day: %s", day, month, year, GregorianCalendar.nextDay(day, month, year));

    }
}
