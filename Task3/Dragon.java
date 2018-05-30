package by.dyagel;

public class Dragon {

    public static final int EYES_ON_HEAD = 2;//number of eyes on dragon head
    public static final int BIRTH_HEADS = 3;//number of heads when dragon is born
    public static final int FIRST_CHANGING_AGE = 200;//age after which dragon adds 2 heads a year
    public static final int SECOND_CHANGING_AGE = 300;//age after which dragon adds 1 head a year
    public static final int HEADS_ADDING_BEFORE_200 = 3;
    public static final int HEADS_ADDING_AFTER_200 = 2;

    public static int getHeadsNumber(int age) {
        int heads = BIRTH_HEADS;
        if (age <= FIRST_CHANGING_AGE) {
            heads += age * HEADS_ADDING_BEFORE_200;
        } else if (age <= SECOND_CHANGING_AGE) {
            heads += FIRST_CHANGING_AGE * HEADS_ADDING_BEFORE_200;
            heads += (age - FIRST_CHANGING_AGE) * HEADS_ADDING_AFTER_200;
        } else {
            heads += FIRST_CHANGING_AGE * HEADS_ADDING_BEFORE_200;
            heads += (SECOND_CHANGING_AGE - FIRST_CHANGING_AGE) * HEADS_ADDING_AFTER_200;
            heads += (age - SECOND_CHANGING_AGE);
        }
        return heads;
    }

    public static int getEyesNumber(int heads) {
        return EYES_ON_HEAD * heads;
    }
}
