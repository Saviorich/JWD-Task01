package by.epam.tc.task01.t05.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void isPerfect() {
        assertEquals(true, Math.isPerfect(496));
    }
}