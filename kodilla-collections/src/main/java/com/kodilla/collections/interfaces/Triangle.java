package com.kodilla.collections.interfaces;

public class Triangle implements Shape {
    double width = 0;
    double height = 0;
    double hypotenuse = 0;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height * 0.5;
    }

    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }
}