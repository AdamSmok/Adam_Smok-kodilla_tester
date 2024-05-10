package com.kodilla.optional.homework;

public class Student {
    String name = null;
    Teacher teacher = null;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}