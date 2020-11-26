package by.epam.tc.task01.t06.logic;

public class TimeParser {
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_DAY = 86400;

    public int[] getPassedDayTime(int seconds) {
        if (seconds <= SECONDS_IN_DAY && seconds >= 0) {
            int hours = seconds / SECONDS_IN_HOUR;
            int minutes = (seconds - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
            seconds -= (hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE);
            return new int[]{hours, minutes, seconds};
        }
        return new int[0];
    }
}
