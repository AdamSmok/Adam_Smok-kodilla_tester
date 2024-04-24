package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator;
    int a,b;
    double c,d;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
        a = 5;
        b = 8;
        c = 2;
        d = 0;
    }

    @Test
    public void testAdd() {
        int addResult = calculator.add(a, b);
        assertEquals(13, addResult);
    }

    @Test
    public void testSub() {
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPow() {
        double powResult = calculator.pow(a, b);
        assertEquals(Math.pow(a,b), powResult, 0.00001);
    }

    @Test
    public void testPow2() {
        double powResult = calculator.pow(a, b);
        assertEquals(Math.pow(a,b), powResult, 0.00001);
    }

}