package com.kodilla.basic_assertion;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int pow(int a, int b) {
        return ((int) Math.pow(a, b)) - 1; //"-1" odjęte żeby metoda dawała zły wynik
    }
}