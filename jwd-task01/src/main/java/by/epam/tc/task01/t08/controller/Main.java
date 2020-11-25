package by.epam.tc.task01.t08.controller;

import by.epam.tc.task01.t08.service.Algorithms;
import by.epam.tc.task01.t08.view.Output;

public class Main {
    public static void main(String[] args) {
        int x = 2;

        StringBuilder sb = new StringBuilder();

        sb.append("With x=").append(x);
        sb.append(" function returns ").append(Algorithms.calculateFunction(x));
        Output.consolePrintLine(sb);
    }
}