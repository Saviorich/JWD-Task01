package by.epam.tc.task01.t09.service;

import by.epam.tc.task01.t09.entity.Circle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleService {
    public double getCircleLength(Circle circle) {
        return 2 * PI * circle.getRadius();
    }

    public double getCircleSquare(Circle circle) {
        return PI * pow(circle.getRadius(), 2);
    }
}
