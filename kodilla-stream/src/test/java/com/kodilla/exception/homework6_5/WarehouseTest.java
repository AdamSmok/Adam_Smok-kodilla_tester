package com.kodilla.exception.homework6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void testGetOrderWhenOrderDoesntExist() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("789"));

        String nonExistentOrderNumber = "999";

        OrderDoesntExistException exception = assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder(nonExistentOrderNumber);
        });

        assertEquals("Order with number " + nonExistentOrderNumber + " doesn't exist.", exception.getMessage());
    }
}