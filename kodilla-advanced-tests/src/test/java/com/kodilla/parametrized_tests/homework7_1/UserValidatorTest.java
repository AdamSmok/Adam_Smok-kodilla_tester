package com.kodilla.parametrized_tests.homework7_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test", "value"})
    public void shouldReturnTrueValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"tes#t", "val@ue", "gg"})
    public void shouldReturnFalseValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abs@wp.pl", "abcsfgvfbssc@fdffff.com"})
    public void shouldReturnTruevalidateEmail(String Email) {
        boolean result = userValidator.validateEmail(Email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@bs@wp.pl", "abcsfgvfbssc#dffff.com"})
    public void shouldReturnFalseValidateEmail(String Email) {
        boolean result = userValidator.validateEmail(Email);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(userValidator.isBlank(text));
    }
}