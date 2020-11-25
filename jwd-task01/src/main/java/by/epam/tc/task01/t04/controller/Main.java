package by.epam.tc.task01.t04.controller;

import by.epam.tc.task01.t04.service.Algorithms;
import by.epam.tc.task01.t04.view.Output;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int evenAmount = 4;
        int[] numbers = new int[]{51, 21, 12, 42, 6, 41, 2};
        sb.append("Does ");
        sb.append(Arrays.toString(numbers));
        sb.append(" has ");
        sb.append(evenAmount).append(" evens");
        sb.append(" = ").append(Algorithms.countEven(numbers) >= evenAmount);
        Output.consolePrintLine(sb);
    }
}
