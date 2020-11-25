package by.epam.tc.task01.t02.logic;

import by.epam.tc.task01.t02.exception.InvalidDateException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeParserTest {

    @Test
    public void getDaysInMonthByYear1() {
        try {
            int month = 2;
            int year = 2020;

            int expected = 29;
            int actual = new TimeParser().getDaysInMonthByYear(month, year);

            assertEquals(expected, actual);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
    }
}