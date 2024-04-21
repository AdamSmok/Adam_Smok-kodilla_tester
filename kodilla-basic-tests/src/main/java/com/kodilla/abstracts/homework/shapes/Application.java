package com.kodilla.abstracts.homework.shapes;

public class Application {
    public static void main(String[] args) {
        double radius = 3.0D;
        int height = 4;
        int base = 9;

        Circle circle = new Circle(radius);
        System.out.println("Koło o promieniu: " + Math.round(circle.getRadius()) + " ma pole: " + Math.round(circle.getSurfaceArea()) + " i obwód: " + Math.round(circle.getPerimeter()));


        Rectangle rectangle = new Rectangle(height, base);
        System.out.println("Prostokąt o bokach: " + rectangle.getHeight() + " i " + rectangle.getBase() + " ma pole: " + rectangle.getSurfaceArea() + " i obwód: " + rectangle.getPerimeter());

        Pentagon pentagon = new Pentagon(base);
        System.out.println("Pięciokąt o boku: " + pentagon.getBase() + " ma pole: " + pentagon.getSurfaceArea() + " i obwód: " + pentagon.getPerimeter());

    }
}