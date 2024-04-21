package com.kodilla.abstracts.homework.shapes;

import static java.lang.Math.sqrt;

public abstract class Shape {
    private double radius = 0;
    private int height = 0;
    private int base = 0;
    private double perimeter = 0;
    private double surfaceArea = 0;
    private final double constant = (sqrt(25 + 10 * sqrt(5)))/4;

    public Shape(int base) {
        this.base = base;
        this.perimeter = setPerimeter(base);
        this.surfaceArea = setSurfaceArea(base);
        System.out.println("Konstruktor Shape");
    }

    public Shape(double radius) {
        this.radius = radius;
        this.perimeter = setPerimeter(radius);
        this.surfaceArea = setSurfaceArea(radius);
        System.out.println("Konstruktor Shape");
    }

    public Shape(int height, int base) {
        this.height = height;
        this.base = base;
        this.perimeter = setPerimeter(height, base);
        this.surfaceArea = setSurfaceArea(height, base);
        System.out.println("Konstruktor Shape");
    }

    //dla koła
    public double setPerimeter(double radius) {
        this.perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double setSurfaceArea(double radius) {
        this.surfaceArea = Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }

    //dla pięciokąta
    public double setPerimeter(int base) {
        this.perimeter = constant * Math.pow(base, 2);
        return perimeter;
    }

    public double setSurfaceArea(int base) {
        this.surfaceArea = 5 * base;
        return surfaceArea;
    }

    //dla prostokąta
    public double setPerimeter(int height, int base) {
        this.perimeter = 2 * (height + base);
        return perimeter;
    }

    public double setSurfaceArea(int height, int base) {
        this.surfaceArea = height * base;
        return surfaceArea;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}