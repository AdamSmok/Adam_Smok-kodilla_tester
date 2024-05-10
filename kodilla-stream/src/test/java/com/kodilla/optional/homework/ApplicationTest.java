package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldPrintStudentTeacherPairsWithOptional() {
        // given
        List<Student> students = new ArrayList<>();
        students.add(new Student("Janko Muzykant", new Teacher("Johan Strauss")));
        students.add(new Student("Wiesiek Powsinoga", new Teacher("Jan Sebastian Bach")));
        students.add(new Student("Jaskier Niezrównany", new Teacher(null)));
        students.add(new Student("Nadęty Puzon", new Teacher("Fryderyk Chopin")));
        students.add(new Student("Wodzirej Weselny", new Teacher(null)));
        students.add(new Student("Grajek Pospolity", new Teacher("Jan Sebastian Bach")));

        // when
        Application.printStudentTeacherPairs(students);

        // then
        // test the output manually
    }

    @Test
    public void shouldFindStudentsWithoutTeacher() {
        // given
        List<Student> students = new ArrayList<>();
        students.add(new Student("Janko Muzykant", new Teacher("Johan Strauss")));
        students.add(new Student("Wiesiek Powsinoga", new Teacher("Jan Sebastian Bach")));
        students.add(new Student("Jaskier Niezrównany", new Teacher(null)));
        students.add(new Student("Nadęty Puzon", new Teacher("Fryderyk Chopin")));
        students.add(new Student("Wodzirej Weselny", new Teacher(null)));
        students.add(new Student("Grajek Pospolity", new Teacher("Jan Sebastian Bach")));

        // when
        List<Student> studentsWithoutTeacher = Application.findStudentsWithoutTeacher(students);

        // then
        assertEquals(2, studentsWithoutTeacher.size());
        // add more assertions if needed
    }

    @Test
    public void shouldFindStudentsWithDesiredTeacher() {
        // given
        List<Student> students = new ArrayList<>();
        students.add(new Student("Janko Muzykant", new Teacher("Johan Strauss")));
        students.add(new Student("Wiesiek Powsinoga", new Teacher("Jan Sebastian Bach")));
        students.add(new Student("Jaskier Niezrównany", new Teacher(null)));
        students.add(new Student("Nadęty Puzon", new Teacher("Fryderyk Chopin")));
        students.add(new Student("Wodzirej Weselny", new Teacher(null)));
        students.add(new Student("Grajek Pospolity", new Teacher("Jan Sebastian Bach")));

        // when
        List<Student> studentsWithDesiredTeacher = Application.findStudentsWithDesiredTeacher(students, "Jan Sebastian Bach");

        // then
        assertEquals(2, studentsWithDesiredTeacher.size());
    }
}