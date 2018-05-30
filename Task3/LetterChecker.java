package by.dyagel;

public class LetterChecker {

    public static final String VOWEL_LETTERS = "aeiouyAEIOUY";
    public static final char[] VOWEL_LETTERS_MAS = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        boolean result;
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                result = true;
                break;
            default:
                result = false;
                break;
        }
        return result;
    }

    public static boolean isVowel2(char letter) {
        return VOWEL_LETTERS.contains("" + letter);
    }

    public static boolean isVowel3(char letter) {
        for (char letterInMas : VOWEL_LETTERS_MAS) {
            if (letterInMas == Character.toLowerCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel4(char letter) {
        if (letter == 'A' || letter == 'a') {
            return true;
        } else if (letter == 'E' || letter == 'e') {
            return true;
        } else if (letter == 'I' || letter == 'i') {
            return true;
        } else if (letter == 'O' || letter == 'o') {
            return true;
        } else if (letter == 'U' || letter == 'u') {
            return true;
        } else if (letter == 'Y' || letter == 'y') {
            return true;
        } else {
            return false;
        }
    }
}
