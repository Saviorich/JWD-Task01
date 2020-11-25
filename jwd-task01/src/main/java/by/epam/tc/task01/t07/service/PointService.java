package by.epam.tc.task01.t07.service;

import by.epam.tc.task01.t07.entity.Point;

public class PointService {
    public Point getClosestPointToOrigin(Point point1, Point point2) {
        return Math.hypot(point1.getX(), point1.getY()) > Math.hypot(point2.getX(), point2.getY()) ? point2 : point1;
    }
}
