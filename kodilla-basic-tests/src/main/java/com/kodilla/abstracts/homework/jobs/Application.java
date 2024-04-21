package com.kodilla.abstracts.homework.jobs;

public class Application {
    public static void main(String[] args) {
        String firstName = "Adam";
        int age = 23;
        int salary = 5000;
        String responsibilities = "Administering systems, having coffee with friends";
        Person admin = new Person();
        Person dudus = new Person();
        admin.firstName = "Adam";
        admin.age = 23;
        admin.job.salary = 5000;
        admin.job.responsibilities = "Administering systems, having coffee with friends";
        dudus.firstName = "Andrzej";
        dudus.age = 40;
        dudus.job.salary = 30000;
        dudus.job.responsibilities = "Signing everything, bringing shame to the country";


        personStatistics(admin);
        personStatistics(dudus);
    }

    private static void personStatistics(Person person) {
        System.out.println(person.getFirstName() +" ma "+person.getAge() +" lat. " + " Zarabia: " + person.job.getSalary() + ".");
        System.out.println("Jego obowiązki to: "+ person.job.getResponsibilities());

    }
}