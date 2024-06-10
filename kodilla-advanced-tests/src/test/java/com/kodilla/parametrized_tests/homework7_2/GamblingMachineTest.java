package com.kodilla.parametrized_tests.homework7_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class GamblingMachineTest {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 0)
    public void shouldCalculateWinsCorrectly(String numbers) throws InvalidNumbersException {
        Set<Integer> userNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        int wins = gamblingMachine.howManyWins(userNumbers);

        Assertions.assertTrue(wins >= 0 && wins <= 6, "Number of wins should be between 0 and 6");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalid-data.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionForInvalidNumbers(String numbers) {
        Set<Integer> userNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}