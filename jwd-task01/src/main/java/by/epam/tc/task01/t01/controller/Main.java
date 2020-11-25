package by.epam.tc.task01.t01.controller;

import by.epam.tc.task01.t01.service.Algorithms;
import by.epam.tc.task01.t01.view.Output;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int number1 = 713;
        float number2 = 152.125f;
        double number3 = 124.1424125;

        sb.append("LastPowerDigit of ").append(number1);
        sb.append(" is ").append(Algorithms.getPowerLastDigit(number1));
        sb.append(", of ").append(number2);
        sb.append(" is ").append(Algorithms.getPowerLastDigit(number2));
        sb.append(", of ").append(number3);
        sb.append(" is ").append(Algorithms.getPowerLastDigit(number3));

        Output.consolePrintLine(sb);
    }
}
