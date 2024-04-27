package com.kodilla.collections.interfaces.homework4_2;

public class Toyota implements Car {
    private String name = null;
    private double accelerate = 0;
    private double brake = 0;
    private double speed = 0;

    public Toyota(String name, double accelerate, double brake, double speed) {
        this.name = name;
        this.accelerate = accelerate;
        this.brake = brake;
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += accelerate;
    }

    @Override
    public void decreaseSpeed() {
        speed -= brake;
    }

    public String getName() {
        return name;
    }
}