package by.epam.tc.task01.t03.controller;

import by.epam.tc.task01.t03.entity.Square;
import by.epam.tc.task01.t03.service.SquareService;
import by.epam.tc.task01.t03.view.Output;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Square square = new Square(5);
        double result = new SquareService().findSquareInCircle(square);
        sb.append("Square of square inner circle inner ").append(square);
        sb.append(" is ").append(result);

        Output.consolePrintLine(sb);
    }
}