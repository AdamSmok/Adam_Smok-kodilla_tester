package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Darth Vader",3,2,true));
        stamps.add(new Stamp("Jar Jar Binks",2,2,true));
        stamps.add(new Stamp("Obi-Wan Kenobi",5,3,true));
        stamps.add(new Stamp("Yoda",1,1,false));
        stamps.add(new Stamp("Darth Vader",3,2,false));
        stamps.add(new Stamp("Jar Jar Binks",2,2,true));
        showStampsCollection(stamps);
    }

    public static void showStampsCollection(Set stamps){
        System.out.println(stamps.size());
        for(Object stamp : stamps){
            System.out.println(stamp);
        }
    }
}