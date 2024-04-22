package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int addResult = calculator.add(a, b);
        assertEquals(13, addResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double a = 2;
        double b = -2;
        double powResult = calculator.pow(a, b);
        assertEquals(0.25, powResult, 0.00001);
    }
}