package com.kodilla.exception;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    public static void main(String[] args) {


        Set<Order> orders = new HashSet<>();
        orders.add(new Order("abc123"));
    }
}
