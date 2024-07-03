package com.kodilla.spring.basic.spring_configuration.homework9_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarFactoryTest {

    @Test
    public void shouldCreateCarBasedOnSeason() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        // When
        String carType = car.getCarType();
        boolean headlights = car.hasHeadlightsTurnedOn();
        System.out.println(carType + " - Headlights On: " + headlights);
        // Then
        Assertions.assertNotNull(carType);
        Assertions.assertNotNull(headlights);
    }
}