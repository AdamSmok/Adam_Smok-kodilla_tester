package Modul_2_8;

import java.util.Scanner;

public class UserDialog {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Na jaką literę ma się zaczynać kolor: ");
            String name = scanner.nextLine();
            if (name.length() == 1) {
                return name;
            } else {
                System.out.println("Masz podać jedną literę.");
            }
        }
    }
}