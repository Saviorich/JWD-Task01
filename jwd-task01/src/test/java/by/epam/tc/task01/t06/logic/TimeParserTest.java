package by.epam.tc.task01.t06.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TimeParserTest {

    @Test
    void getPassedDayTime() {
        int[] expected = {24, 0, 0};
        int[] actual = new TimeParser().getPassedDayTime(86399);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}