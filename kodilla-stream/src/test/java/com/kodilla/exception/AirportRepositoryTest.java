package com.kodilla.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AirportRepositoryTest {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withException() {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        // then
        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }
}