package com.kodilla.abstracts.homework.jobs;

public class Application {
    public static void main(String[] args) {
        Person admin = new Person("Adam", 25, new IT_specialist(5000, "Administering systems, having coffee with friends"));
        Person dudus = new Person("Andrzej", 40, new Prezydent_RP(30000, "Signing everything, bringing shame to the country"));

        personStatistics(admin);
        personStatistics(dudus);
    }

    private static void personStatistics(Person person) {
        System.out.println(person.getFirstName() +" ma "+person.getAge() +" lat. " + " Zarabia: " + person.job.getSalary() + ".");
        System.out.println("Jego obowiązki to: "+ person.job.getResponsibilities());

    }
}