package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car kia = new Kia(10.0, 15, 15);
        doRace(kia);
        Car ram = new RAM(20.0, 10, 5);
        doRace(ram);
        Car toyota = new Toyota(12, 20, 20);
        doRace(toyota);
    }

    private static void doRace(Car car) {
        int accelerationCount = 3;
        int brakingCount = 2;
        for (int i = 0; i < accelerationCount; i++) {car.increaseSpeed();}
        for (int i = 0; i < brakingCount; i++)      {car.decreaseSpeed();}
        System.out.println(car.getName() +" - porusza sie z prękością: "+ car.getSpeed());
    }
}