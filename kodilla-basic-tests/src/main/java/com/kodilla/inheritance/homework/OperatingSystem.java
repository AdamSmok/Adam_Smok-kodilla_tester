package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int yearOfRelease = 0;

    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
        System.out.println("Jestem konstruktorem klasy OperatingSystem");
    }

    public int getyearOfRelease() {
        return yearOfRelease;
    }

    public void turnOn() {
        System.out.println("Turning on ...");
    }

    public void turnOff() {
        System.out.println("Turning off...");
    }
}