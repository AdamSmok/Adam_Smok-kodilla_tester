package com.kodilla.collections.adv.maps.homework5_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal dumblebore = new Principal("Albus", "Dumblebore");
        Principal vesemir = new Principal("Uncle", "Vesemir");
        Principal gandalf = new Principal("Grey", "Gandalf");

        School hogwart = new School("Hogwart", Arrays.asList(23, 25, 20, 27));
        School kaerMorhen = new School("Kaer Morhen", Arrays.asList(5, 7, 3, 1));
        School middleEarth = new School("Middle Earth", Arrays.asList(15, 11, 9, 12));

        schools.put(dumblebore, hogwart);
        schools.put(vesemir, kaerMorhen);
        schools.put(gandalf, middleEarth);

        for (Map.Entry<Principal, School> school : schools.entrySet()) {
            System.out.println(school.getKey().getFirstName() + " " + school.getKey().getLastName() +
                    " manages " + school.getValue().getName() + " with total number of students: " +
                    school.getValue().getTotalCountOfStudents());
        }
    }
}