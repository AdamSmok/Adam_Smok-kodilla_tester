import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        /*System.out.println("Podaj rok do sprawdzenia.");
        //pobieram dane od użytkownika
        Scanner read = new Scanner(System.in);
        int year = read.nextInt();

        if (leap(year)) {
            System.out.println("Podany rok jest przestepny.");
        } else {
            System.out.println("Podany rok nie jest przestepny.");
        }*/
        for (int year = 1976; year < 2030; year++) {
            if (leap(year)) System.out.println("Podany rok jest przestepny: " + year);
        }

    }

    //sprawdzam czy rok jest przestępny
    private static boolean leap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}

