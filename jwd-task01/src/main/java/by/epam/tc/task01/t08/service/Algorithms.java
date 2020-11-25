package by.epam.tc.task01.t08.service;

import static java.lang.Math.pow;

public class Algorithms {

    public static double calculateFunction(double x) {
        return x >= 3 ? -pow(x, 2) + 3 * x + 9 : 1 / (pow(x, 3) - 6);
    }
}
