//import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class LeapYear {
    public static <List> void main(String[] args) {
        ArrayList<Integer> yearsList = new ArrayList<Integer>();
        yearsList.add(1970);
        yearsList.add(1971);
        yearsList.add(1972);
        yearsList.add(1973);
        yearsList.add(1974);
        yearsList.add(1975);
        yearsList.add(1976);
        /*for (int year = 1976; year < 2030; year++) {
            if (leap(year)) System.out.println("Podany rok jest przestepny: " + year);
        }*/
        for (int year : yearsList) {
            System.out.println("Sprawdzam dla: " + year + leap(year));
        }
    }
    //sprawdzam czy rok jest przestępny
    private static String leap(int year) {
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            return "Rok przestępny.";
        }else{
            return "Rok nie przestępny.";
        }
    }
}