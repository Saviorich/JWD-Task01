package by.epam.tc.task01.t02.controller;

import by.epam.tc.task01.t02.exception.InvalidDateException;
import by.epam.tc.task01.t02.logic.TimeParser;
import by.epam.tc.task01.t02.view.Output;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        TimeParser parser = new TimeParser();

        try {
            int month = 9;
            int year = 1941;
            sb.append("In the month number ").append(month);
            sb.append(" of year ").append(year);
            sb.append(" there were ").append(parser.getDaysInMonthByYear(9, 1941));
            sb.append(" days.");
            Output.consolePrintLine(sb);
        } catch (InvalidDateException e) {
            Output.consolePrintLine(e.getMessage());
        } finally {
            sb.setLength(0);
        }
    }
}
