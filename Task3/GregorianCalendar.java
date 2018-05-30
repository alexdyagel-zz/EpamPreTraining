package by.dyagel;

public class GregorianCalendar {
    public static int LAST_DAY_31 = 31;
    public static int LAST_DAY_30 = 30;
    public static int LAST_DAY_29 = 29;
    public static int LAST_DAY_28 = 28;
    public static int NUMBER_OF_MONTHS = 12;
    public static int FIRST_MONTH_OF_THE_YEAR = 1;
    public static int FIRST_DAY_OF_THE_MONTH = 1;

    public static String nextDay(int day, int month, int year) {
        int lastDay = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = LAST_DAY_31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = LAST_DAY_30;
                break;
            case 2:
                if (isLeap(year)) {
                    lastDay = LAST_DAY_29;
                } else {
                    lastDay = LAST_DAY_28;
                }
                break;
        }
        if (day < lastDay) {
            day++;
        } else if (day == lastDay && month == NUMBER_OF_MONTHS) {
            day = FIRST_DAY_OF_THE_MONTH;
            month = FIRST_MONTH_OF_THE_YEAR;
            year++;
        } else {
            day = FIRST_DAY_OF_THE_MONTH;
            month++;
        }
        String result = day + "." + month + "." + year;
        return result;
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
