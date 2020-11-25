package by.epam.tc.task01.t07.service;

import by.epam.tc.task01.t07.entity.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointServiceTest {

    @Test
    void getClosestPointToOrigin() {
        Point expected = new Point(-45, 47);
        Point point = new Point(100, 1);
        PointService service = new PointService();
        Point actual = service.getClosestPointToOrigin(expected, point);
        assertEquals(expected, actual);
    }
}