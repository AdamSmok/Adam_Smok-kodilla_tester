package com.kodilla.abstracts.homework.shapes;

public class Rectangle extends Shape {
    private int height;
    private int base;

    public Rectangle(int height, int base) {
        super(height, base);
        System.out.println("Konstruktor Rectangle");
    }
}