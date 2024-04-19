package com.kodilla.inheritance.homework;

public abstract class Main {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem(1980);
        Linux linux = new Linux(1990);
        Windows windows = new Windows(2000);
        systemParameters(os);
        systemParameters(linux);
        systemParameters(windows);
    }

    public static void systemParameters(OperatingSystem os1) {
        System.out.println("\nRok Wydania: " + os1.getyearOfRelease());
        os1.turnOff();
        os1.turnOn();
    }
}