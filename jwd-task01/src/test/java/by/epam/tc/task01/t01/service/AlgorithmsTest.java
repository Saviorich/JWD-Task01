package by.epam.tc.task01.t01.service;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlgorithmsTest {

    @Test
    public void getPowerLastDigit1() {
        int number = 125;

        int expected = 5;
        int actual = Algorithms.getPowerLastDigit(number);

        assertEquals(expected, actual);
    }

    @Test
    public void getPowerLastDigit2() {
        float number = 3.14159f;

        int expected = 1;
        int actual = Algorithms.getPowerLastDigit(number);

        assertEquals(expected, actual);
    }

    @Test
    public void getPowerLastDigit3() {
        double number = 3.141592653589793;

        int expected = 9;
        int actual = Algorithms.getPowerLastDigit(number);

        assertEquals(expected, actual);
    }
}