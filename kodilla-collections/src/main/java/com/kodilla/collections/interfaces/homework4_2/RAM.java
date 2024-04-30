package com.kodilla.collections.interfaces.homework4_2;

public class RAM implements Car {
    protected final String name = "RAM";
    private double accelerate = 0;
    private double brake = 0;
    private double speed = 0;

    public RAM(double accelerate, double brake, double speed) {
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
    public String getName(){
        return name;
    }
}