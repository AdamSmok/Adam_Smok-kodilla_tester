package com.kodilla.collections.lists.homework;

import java.util.Objects;

public class Cheap implements Car {

    private int millage = 0;
    private double price = 0;

    public Cheap(int millage, double price) {
        this.millage = millage;
        this.price = price;
    }

    @Override
    public int getMillage() {
        return millage;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cheap{" + "millage=" + millage + ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cheap cheap = (Cheap) o;
        return millage == cheap.millage && Double.compare(price, cheap.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(millage, price);
    }
}