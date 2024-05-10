package com.kodilla.optional.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Janko Muzykant", new Teacher("Johan Strauss")));
        students.add(new Student("Wiesiek Powsinoga", new Teacher("Jan Sebastian Bach")));
        students.add(new Student("Jaskier Niezrównany", null));
        students.add(new Student("Nadęty Puzon", new Teacher("Fryderyk Chopin")));
        students.add(new Student("Wodzirej Weselny", null));
        students.add(new Student("Grajek Pospolity", new Teacher("Jan Sebastian Bach")));

        printStudentTeacherPairs(students);

        List<Student> studentsWithoutTeacher = findStudentsWithoutTeacher(students);
        System.out.println("\nStudents without teacher:");
        studentsWithoutTeacher.forEach(student -> System.out.println(student.getName()));

        String desiredTeacherName = "Jan Sebastian Bach";
        List<Student> studentsWithDesiredTeacher = findStudentsWithDesiredTeacher(students, desiredTeacherName);
        System.out.println("\nStudents with desired teacher (" + desiredTeacherName + "):");
        studentsWithDesiredTeacher.forEach(student -> System.out.println(student.getName()));
    }

    public static void printStudentTeacherPairs(List<Student> students) {
        for (Student student : students) {
            String studentName = student.getName();
            String teacherName = student.getTeacher()
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + studentName + ", Nauczyciel: " + teacherName);
        }
    }

    public static List<Student> findStudentsWithoutTeacher(List<Student> students) {
        List<Student> studentsWithoutTeacher = new ArrayList<>();
        for (Student student : students) {
            if (!student.getTeacher().isPresent()) {
                studentsWithoutTeacher.add(student);
            }
        }
        return studentsWithoutTeacher;
    }

    public static List<Student> findStudentsWithDesiredTeacher(List<Student> students, String desiredTeacherName) {
        List<Student> studentsWithDesiredTeacher = new ArrayList<>();
        for (Student student : students) {
            if (student.getTeacher()
                    .filter(teacher -> desiredTeacherName.equals(teacher.getName()))
                    .isPresent()) {
                studentsWithDesiredTeacher.add(student);
            }
        }
        return studentsWithDesiredTeacher;
    }
}