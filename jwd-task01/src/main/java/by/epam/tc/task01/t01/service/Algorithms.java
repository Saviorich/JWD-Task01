package by.epam.tc.task01.t01.service;

public class Algorithms {
    public static int getPowerLastDigit(int number) {
        return number % 10 * number % 10;
    }

    public static int getPowerLastDigit(float number) {
        String stringNumber = String.valueOf(number);
        return getPowerLastDigit(Character.getNumericValue(stringNumber.charAt(stringNumber.length() - 1)));
    }

    public static int getPowerLastDigit(double number) {
        String stringNumber = String.valueOf(number);
        return getPowerLastDigit(Character.getNumericValue(stringNumber.charAt(stringNumber.length() - 1)));
    }
}
