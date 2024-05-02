package com.kodilla.collections.adv.immutable.homework5_3;

public class Application {
    public static void main(String[] args) {
        Task[] task = new Task[3];

        task[0] = new Task("Doing homework", 100);
        task[1] = new Task("Sleeping", 360);
        task[2] = new Task("Working", 480);

        for(Task t : task){
            showTask(t);
        }
    }

    public static void showTask(Task task) {
        System.out.println(task.title() + " takes " + task.duration() + " minutes.");
    }
}