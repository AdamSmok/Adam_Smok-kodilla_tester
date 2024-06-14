package com.kodilla.collections.adv.exercises.homework5_4;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTest {

    @Test
    public void testFindFlightsFrom() {
        // given
        List<FlightRecord> flights = FlightRepository.getFlights();
        FlightFinder flightFinder = new FlightFinder(flights);
        FlightRecord expectedFlight = new FlightRecord("Warsaw", "London");
        // when
        List<FlightRecord> foundFlights = flightFinder.findFlightsFrom("Warsaw");
        // then
        assertEquals(1, foundFlights.size());
        assertEquals(expectedFlight, foundFlights.get(0));
    }

    @Test
    public void testFindFlightsTo() {
        // given
        List<FlightRecord> flights = FlightRepository.getFlights();
        FlightFinder flightFinder = new FlightFinder(flights);
        FlightRecord expectedFlight = new FlightRecord("London", "Paris");
        // when
        List<FlightRecord> foundFlights = flightFinder.findFlightsTo("Paris");
        // then
        assertEquals(1, foundFlights.size());
        assertEquals(expectedFlight, foundFlights.get(0));
    }
}