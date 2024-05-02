package com.kodilla.collections.adv.maps.homework5_2;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String lastName;

    public Principal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


/*    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }*/
}