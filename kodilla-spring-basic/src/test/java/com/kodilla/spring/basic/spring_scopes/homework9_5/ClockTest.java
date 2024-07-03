package com.kodilla.spring.basic.spring_scopes.homework9_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class ClockTest {

    @Test
    public void shouldCreateDifferentTimesInBeans() throws InterruptedException {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework9_5");
        Clock clock1 = (Clock) context.getBean(Clock.class);
        Thread.sleep(1);
        Clock clock2 = (Clock) context.getBean(Clock.class);
        // When
        LocalTime time1 = clock1.getCurrentTime();
        LocalTime time2 = clock2.getCurrentTime();
        // Then
        Assertions.assertNotEquals(time1, time2);
    }
}