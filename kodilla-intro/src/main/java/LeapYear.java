import java.util.Scanner;

public class LeapYear {
    //sprawdzam czy rok jest przestępny
    private static boolean leap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    //pobieram dane od użytkownika
    public static void main(String[] args) {
        System.out.println("Podaj rok do sprawdzenia.");
        Scanner read = new Scanner(System.in);
        int year = read.nextInt();

        if (leap(year)) {
            System.out.println("Podany rok jest przestepny.");
        } else {
            System.out.println("Podany rok nie jest przestepny.");
        }
    }
}

