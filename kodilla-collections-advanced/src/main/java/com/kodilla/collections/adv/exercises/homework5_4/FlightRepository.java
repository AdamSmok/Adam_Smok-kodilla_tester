package com.kodilla.collections.adv.exercises.homework5_4;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<FlightRecord> getFlights() {
        List<FlightRecord> flights = new ArrayList<>();
        flights.add(new FlightRecord("Warsaw", "London"));
        flights.add(new FlightRecord("London", "Paris"));
        flights.add(new FlightRecord("Paris", "New York"));
        flights.add(new FlightRecord("New York", "Tokyo"));
        return flights;
    }
}