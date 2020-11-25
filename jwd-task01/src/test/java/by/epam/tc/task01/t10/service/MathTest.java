package by.epam.tc.task01.t10.service;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void calculateTanOnSegment() {
        Map<Double, Double> expected = new HashMap<>();
        expected.put(1d, 1.5574077246549023);
        expected.put(2d, -2.185039863261519);
        expected.put(3d, -0.1425465430742778);
        expected.put(4d, 1.1578212823495777);
        expected.put(5d, -3.380515006246586);

        Map<Double, Double> actual = Math.calculateTanOnSegment(1d,5d, 1d);
        assertEquals(expected, actual);
    }
}