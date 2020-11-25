package by.epam.tc.task01.t03.service;

import by.epam.tc.task01.t03.entity.Square;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareServiceTest {

    @Test
    public void findSquareInCircle() {
        double expected = 12.503776140394402;
        double actual = new SquareService().findSquareInCircle(new Square(5));

        assertEquals(expected, actual, 1e-5);
    }
}