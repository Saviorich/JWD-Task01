package by.epam.tc.task01.t07.controller;

import by.epam.tc.task01.t07.entity.Point;
import by.epam.tc.task01.t07.service.PointService;
import by.epam.tc.task01.t07.view.Output;

public class Main {
    public static void main(String[] args) {
        PointService service = new PointService();
        StringBuilder sb = new StringBuilder();
        Point point1 = new Point(15, 51);
        Point point2 = new Point(-52, 3);

        sb.append("Of two given point: ");
        sb.append(point1);
        sb.append(" and ");
        sb.append(point2);
        sb.append(" the closest to the origin is ");
        sb.append(service.getClosestPointToOrigin(point1, point2));
        Output.consolePrintLine(sb);
    }
}
