package com.kodilla.collections.adv.exercises.homework5_4;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private List<FlightRecord> flights;

    public FlightFinder(List<FlightRecord> flights) {
        this.flights = flights;
    }

    public List<FlightRecord> findFlightsFrom(String departure) {
        List<FlightRecord> foundFlights = new ArrayList<>();
        for (FlightRecord flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                foundFlights.add(flight);
            }
        }
        return foundFlights;
    }

    public List<FlightRecord> findFlightsTo(String arrival) {
        List<FlightRecord> foundFlights = new ArrayList<>();
        for (FlightRecord flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                foundFlights.add(flight);
            }
        }
        return foundFlights;
    }
}