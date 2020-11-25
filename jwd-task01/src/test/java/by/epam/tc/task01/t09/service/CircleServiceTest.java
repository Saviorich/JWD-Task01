package by.epam.tc.task01.t09.service;

import by.epam.tc.task01.t09.entity.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {

    @Test
    void getCircleLength() {
        CircleService service = new CircleService();
        Circle circle = new Circle(0.5);

        double expected = Math.PI;
        double actual = service.getCircleLength(circle);

        assertEquals(expected, actual);
    }

    @Test
    void getCircleSquare() {
        CircleService service = new CircleService();
        Circle circle = new Circle(5);

        double expected = 78.53981633974483;
        double actual = service.getCircleSquare(circle);

        assertEquals(expected, actual);
    }
}