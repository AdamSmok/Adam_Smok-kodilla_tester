package com.kodilla.spring.basic.spring_dependency_injection.homework9_2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        // given
        double a = 5.5;
        double b = 2.5;
        // when
        double result = calculator.add(a, b);
        // then
        assertEquals(8.0, result);
    }

    @Test
    public void testSubtract() {
        // given
        double a = 5.5;
        double b = 2.5;
        // when
        double result = calculator.subtract(a, b);
        // then
        assertEquals(3.0, result);
    }

    @Test
    public void testMultiply() {
        // given
        double a = 5.5;
        double b = 2.0;
        // when
        double result = calculator.multiply(a, b);
        // then
        assertEquals(11.0, result);
    }

    @Test
    public void testDivide() {
        // given
        double a = 5.5;
        double b = 2.0;
        // when
        double result = calculator.divide(a, b);
        // then
        assertEquals(2.75, result);
    }

    @Test
    public void testDivideByZero() {
        // given
        double a = 5.5;
        double b = 0.0;
        // when
        double result = calculator.divide(a, b);
        // then
        assertTrue(Double.isNaN(result));
    }
}