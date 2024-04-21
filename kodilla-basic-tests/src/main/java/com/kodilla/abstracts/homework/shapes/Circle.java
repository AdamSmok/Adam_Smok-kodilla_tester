package com.kodilla.abstracts.homework.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(radius);
        System.out.println("Konstruktor Circle");
    }
}
