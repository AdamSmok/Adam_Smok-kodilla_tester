package com.kodilla.collections.interfaces.homework4_2;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int typeOfCar = random.nextInt(3); // Będę losował auta

        switch (typeOfCar) {
            case 0:
                return new Kia("Kia", 10.0, 15, 15);
            //nie wiem dlaczego ale po tych RETURNACH "break" jest nieakceplowalne
            case 1:
                return new RAM("RAM", 20.0, 10, 5);
            case 2:
                return new Toyota("Toyota", 12, 20, 20);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        int howManyCars = random.nextInt(15) + 1;
        Car[] cars = new Car[howManyCars];
        for (i = 0; i < howManyCars; i++) {
            cars[i] = drawCar();
        }
        i =1;
        for (Car car : cars) {
            System.out.println("\n\nWyświetlam informacje o aucie: " + i++);
            CarUtils.describeCar(car);
        }
    }
}