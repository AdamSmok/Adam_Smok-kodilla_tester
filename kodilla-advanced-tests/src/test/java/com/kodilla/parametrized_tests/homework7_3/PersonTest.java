package com.kodilla.parametrized_tests.homework7_3;

import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTest {

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework7_3.PersonTestDataProvider#provideBMIData")
    public void shouldCalculateBMI(double height, double weight, String expectedBMI) {
        Person person = new Person(height, weight);
        assertEquals(expectedBMI, person.getBMI());
    }
}