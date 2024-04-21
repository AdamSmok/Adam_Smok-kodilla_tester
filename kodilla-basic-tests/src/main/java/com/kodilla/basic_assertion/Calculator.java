package com.kodilla.basic_assertion;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double pow(double a, double b) {
        return (Math.pow(a, b)) - 1; //"-1" odjęte żeby metoda dawała zły wynik
    }
}