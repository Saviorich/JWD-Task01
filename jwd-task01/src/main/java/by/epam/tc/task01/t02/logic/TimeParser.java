package by.epam.tc.task01.t02.logic;

import by.epam.tc.task01.t02.exception.InvalidDateException;

public class TimeParser {
    private static final int[] DAYS_IN_MONTH =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    public int getDaysInMonthByYear(int month, int year) throws InvalidDateException {
        if (month >= 1 && month <= 12) {
            if (isLeap(year) && month == 2) {
                return 29;
            }
            return DAYS_IN_MONTH[month - 1];
        } else {
            throw new InvalidDateException("Invalid month number.");
        }
    }
}
