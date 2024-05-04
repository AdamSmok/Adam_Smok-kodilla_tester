package com.kodilla.collections.adv.maps.homework5_2;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> school = new ArrayList<>();

    public School(String name, List<Integer> school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getTotalCountOfStudents() {
        int sum = 0;
        for (int studentsCountPerClass : school)
            sum += studentsCountPerClass;
        return sum;
    }
}