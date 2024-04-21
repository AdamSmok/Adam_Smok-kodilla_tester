package com.kodilla.abstracts.homework.jobs;

public abstract class Job {
    public int salary;
    public String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        System.out.println("Konstruktor Joba");
    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }
}