package com.kodilla.collections.interfaces.homework4_2;

public class Toyota implements Car {
    protected final String name = "Toyota";
    private double accelerate = 0;
    private double brake = 0;
    private double speed = 0;

    public Toyota(double accelerate, double brake, double speed) {
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

    @Override
    public String getName() {
        return name;
    }
}