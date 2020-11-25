package by.epam.tc.task01.t05.controller;

import by.epam.tc.task01.t05.service.Math;
import by.epam.tc.task01.t05.view.Output;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int number = 6;
        sb.append("Is ").append(number);
        sb.append(" perfect number? - ").append(Math.isPerfect(number));
        Output.consolePrintLine(sb);
    }
}
