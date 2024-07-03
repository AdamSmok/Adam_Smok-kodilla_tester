package com.kodilla.spring.basic.spring_dependency_injection.homework9_3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessWhenWeightIsBelow30() {
        String result = shippingCenter.sendPackage("Jaroslaw Kaczynski Street 1", 25.0);
        assertEquals("Package delivered to: Jaroslaw Kaczynski Street 1", result);
    }

    @Test
    public void shouldReturnFailWhenWeightIsAbove30() {
        String result = shippingCenter.sendPackage("Jaroslaw Kaczynski Street 1", 35.0);
        assertEquals("Package not delivered to: Jaroslaw Kaczynski Street 1", result);
    }
}