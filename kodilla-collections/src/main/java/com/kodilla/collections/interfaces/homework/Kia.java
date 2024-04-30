package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    protected final String name = "Kia";
    private double accelerate = 0;
    private double brake = 0;
    private double speed = 0;

    public Kia(double accelerate, double brake, double speed) {
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
        if(speed<0){speed = 0;}
    }

    @Override
    public String getName(){
        return name;
    }
}