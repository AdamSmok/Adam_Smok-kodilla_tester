package com.kodilla.spring.basic.spring_configuration.homework9_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CarFactory {

    @Bean
    public Car chooseCar() {
        Month month = LocalDate.now().getMonth();
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return new SUV();
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return new Cabrio();
        } else {
            return new Sedan();
        }
    }
}
