package by.epam.tc.task01.t04.service;

public class Algorithms {
    public static int countEven(int... numbers){
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
