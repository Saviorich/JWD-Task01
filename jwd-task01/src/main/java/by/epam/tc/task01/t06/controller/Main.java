package by.epam.tc.task01.t06.controller;

import by.epam.tc.task01.t06.logic.TimeParser;
import by.epam.tc.task01.t06.view.Output;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TimeParser parser = new TimeParser();
        StringBuilder sb = new StringBuilder();
        int seconds = 11111;

        sb.append("With seconds=").append(seconds);
        sb.append(" passed time [h, m, s] = ").append(Arrays.toString(parser.getPassedDayTime(seconds)));
        Output.consolePrintLine(sb);
    }
}