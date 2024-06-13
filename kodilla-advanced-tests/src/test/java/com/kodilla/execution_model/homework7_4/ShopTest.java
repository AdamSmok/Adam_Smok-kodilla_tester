package com.kodilla.execution_model.homework7_4;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(200.0, LocalDate.of(2023, 6, 10), "user1");
    Order order2 = new Order(150.0, LocalDate.of(2023, 6, 11), "user2");
    Order order3 = new Order(300.0, LocalDate.of(2023, 6, 12), "user3");


    @Test
    public void shouldCreateOrder() {
        //Given
        Order newOrder = new Order(100.0, LocalDate.of(2023, 6, 15), "user4");

        //Then
        assertEquals(100.0, newOrder.getValue());
        assertEquals(LocalDate.of(2023, 6, 15), newOrder.getDate());
        assertEquals("user4", newOrder.getLogin());
    }

    @Test
    public void shouldAddOrderToShop() {
        //When
        shop.addOrder(order1);

        //Then
        assertEquals(4, shop.getNumberOfOrders());
    }

/*    @Test
    public void shouldGetOrdersWithinDateRange() {
        //When
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        List<Order> result = shop.getOrdersByDateRange(LocalDate.of(2023, 6, 10), LocalDate.of(2023, 6, 11));

        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldGetOrdersWithinValueRange() {
        //When
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        List<Order> result = shop.getOrdersByValueRange(150.0, 200.0);

        //Then
        assertEquals(2, result.size());
    }*/

    @Test
    public void shouldReturnNumberOfOrders() {
        //When
        shop.addOrder(order1);
        shop.addOrder(order2);

        //Then
        assertEquals(5, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnTotalOrderValue() {
        //When
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);

        //Then
        assertEquals(1300.0, shop.getTotalOrderValue(), 0.01);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @AfterEach
    public void resetValues() {
        shop = new Shop();
        System.out.println("Resetting shop...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
