package by.epam.tc.task01.t03.service;

import by.epam.tc.task01.t03.entity.Square;

public class SquareService {
    public double findSquareInCircle(Square square) {
        return getArea(new Square(square.getA() / 1.414));
    }

    public double getArea(Square square) {
        return square.getA() * square.getA();
    }
}
