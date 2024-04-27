package com.kodilla.collections.lists.homework;

import java.util.Objects;

public class Middle implements Car {

    private int millage = 0;
    private double price = 0;

    public Middle(int millage, double price) {
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
        return "Middle{" + "millage=" + millage + ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Middle middle = (Middle) o;
        return millage == middle.millage && Double.compare(price, middle.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(millage, price);
    }
}