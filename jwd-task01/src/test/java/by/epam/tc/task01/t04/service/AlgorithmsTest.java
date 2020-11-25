package by.epam.tc.task01.t04.service;
;
import org.junit.Assert;
import org.junit.Test;

public class AlgorithmsTest {

    @Test
    public void countEven() {
        int[] arr = {1, 3, 5, 8, 13, 21};

        int expected = 1;
        int actual = Algorithms.countEven(arr);
        Assert.assertEquals(expected, actual);
    }
}