package by.epam.tc.task01.t08.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void calculateFunction() {
        double expected = 0.1621533971136694;
        double actual = Algorithms.calculateFunction(2.3f);

        assertEquals(expected, actual);
    }
}