package by.epam.tc.task01.t09.controller;

import by.epam.tc.task01.t09.entity.Circle;
import by.epam.tc.task01.t09.service.CircleService;
import by.epam.tc.task01.t09.view.Output;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        CircleService service = new CircleService();
        StringBuilder sb = new StringBuilder();

        sb.append(circle);
        sb.append(" length is ").append(service.getCircleLength(circle));
        sb.append(" and square is ").append(service.getCircleSquare(circle));
        Output.consolePrintLine(sb);
    }
}
