package by.dyagel;

import java.util.Random;

public class MoodSensor {

    public static final String VERY_HAPPY = "=DDDDD";
    public static final String HAPPY = "=D";
    public static final String SAD = "=(";
    public static final String VERY_SAD = "=((((";
    public static final String SHOCKED = "8O";
    public static final String NEUTRAL = "=|";
    public static final int NUMBER_OF_EMOTIONS = 6;

    public static String getUsersMood() {
        String emotion;
        Random random = new Random(System.currentTimeMillis());
        int emotionNumber = random.nextInt(NUMBER_OF_EMOTIONS);
        switch (emotionNumber) {
            case 0:
                emotion = VERY_HAPPY;
                break;
            case 1:
                emotion = HAPPY;
                break;
            case 2:
                emotion = SAD;
                break;
            case 3:
                emotion = VERY_SAD;
                break;
            case 4:
                emotion = SHOCKED;
                break;
            case 5:
                emotion = NEUTRAL;
                break;
            default:
                emotion = "IT SHOULD NOT OCCUR!!!";
                break;
        }
        return emotion;
    }
}
