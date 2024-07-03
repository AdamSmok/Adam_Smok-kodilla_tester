package com.kodilla.spring.basic.spring_dependency_injection.homework9_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        display.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            display.display(result);
            return result;
        } else {
            System.out.println("!!!It is not allowed to divide byy zero!!!");
            return Double.NaN;
        }
    }
}