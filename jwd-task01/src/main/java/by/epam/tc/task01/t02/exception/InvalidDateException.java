package by.epam.tc.task01.t02.exception;

public class InvalidDateException extends Exception {

    public InvalidDateException() {

    }

    public InvalidDateException(String message) {
        super(message);
    }
}