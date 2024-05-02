package com.kodilla.collections.adv.exercises.homework5_4;

import java.util.Objects;

public record FlightRecord(String departure, String arrival) {

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightRecord flight = (FlightRecord) o;
        return Objects.equals(departure, flight.getDeparture()) && Objects.equals(arrival, flight.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }
}