package com.kodilla.collections.lists;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(width, square.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(width);
    }
}