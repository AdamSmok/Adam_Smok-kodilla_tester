package com.kodilla.collections.lists.homework;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        int numerElementuDoUsuniecia = 0;
        List<Car> cars = new ArrayList<>();
        Middle middleCar = new Middle(6, 50);
        cars.add(new Expensive(10, 100));
        cars.add(new Middle(7, 70));
        cars.add(middleCar);
        cars.add(new Middle(8, 60));
        cars.add(new Cheap(5, 20));

        printInfo(cars);
        System.out.println("Usuwam element nr: " + numerElementuDoUsuniecia);
        cars.remove(numerElementuDoUsuniecia);
        System.out.println("Usuwam element " + middleCar);
        cars.remove(middleCar);
        printInfo(cars);
    }

    public static void printInfo(List<Car> cars) {
        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + ", millage: " + car.getMillage() + ", price: " + car.getPrice());
        }
    }
}