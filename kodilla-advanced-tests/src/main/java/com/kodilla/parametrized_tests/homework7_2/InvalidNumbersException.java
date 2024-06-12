package com.kodilla.parametrized_tests.homework7_2;
public class InvalidNumbersException extends Exception {
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}