package com.kodilla.collections.interfaces;

public class Square implements Shape {
    private double width = 0;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }
}