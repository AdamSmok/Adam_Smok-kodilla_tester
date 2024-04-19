package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int yearOfRelease) {
        super(yearOfRelease);
        System.out.println("Jestem konstruktorem klasy Windows");
    }

    public void turnOn() {
        System.out.println("Turning Windows on ...");
    }

    public void turnOff() {
        System.out.println("Turning Windows off...");
    }
}