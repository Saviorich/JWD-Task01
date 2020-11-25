package by.epam.tc.task01.t10.service;

import java.util.HashMap;
import java.util.Map;

public class Math {
    private Math() {

    }

    public static Map<Double, Double> calculateTanOnSegment(double a, double b, double h) {
        Map<Double, Double> table = new HashMap<>();

        double x = a;
        while (x <= b) {
            table.put(x, java.lang.Math.tan(x));
            x += h;
        }
        return table;
    }
}
