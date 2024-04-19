package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int yearOfRelease) {
        super(yearOfRelease);
        System.out.println("Jestem konstruktorem klasy Linux");
    }

    public void turnOn() {
        System.out.println("Turning Linux on ...");
    }

    public void turnOff() {
        System.out.println("Turning Linux off...");
    }
}