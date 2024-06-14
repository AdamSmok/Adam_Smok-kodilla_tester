package com.kodilla.exception.homework6_5;

import java.util.HashMap;
import java.util.Map;

class Warehouse {
    private final Map<String, Order> orders;

    public Warehouse() {
        this.orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        orders.put(order.getNumber(), order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orders.get(number);
        if (order == null) {
            throw new OrderDoesntExistException("Order with number " + number + " doesn't exist.");
        }
        return order;
    }
}