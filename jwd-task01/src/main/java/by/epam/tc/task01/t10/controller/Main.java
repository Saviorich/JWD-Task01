package by.epam.tc.task01.t10.controller;

import by.epam.tc.task01.t10.view.Output;
import by.epam.tc.task01.t10.service.Math;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int a = -19;
        int b = -11;
        double h = 1;

        sb.append("On a segment [").append(a);
        sb.append(", ").append(b);
        sb.append("]");
        sb.append(" with step ").append(h);
        sb.append(" table equals:\n");

        Map<Double, Double> table = Math.calculateTanOnSegment(a, b, h);
        for (double key : table.keySet()) {
            sb.append("tan(").append(key).append(")").append(" = ").append(table.get(key));
            sb.append("\n");
        }
        Output.consolePrintLine(sb);
    }
}
