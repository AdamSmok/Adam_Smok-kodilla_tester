package com.kodilla.basic_assertion;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Wczytywanie pierwszej liczby (a).");
        double a = numberDouble();
        System.out.println("Wczytywanie drugiej liczby (b).");
        double b = numberDouble();
        double addResult = calc.add(a, b);
        double subResult = calc.sub(a, b);
        double powResult = calc.pow(a, b);
        boolean addCorrect = ResultChecker.assertEquals(a + b, addResult);
        boolean subCorrect = ResultChecker.assertEquals(a - b, subResult);
        boolean powCorrect = ResultChecker.assertEquals(Math.pow(a, b), powResult);
        if (addCorrect) {
            System.out.println("Metoda 'add' działa poprawnie dla a=" + a + " i dla b=" + b);
        } else {
            System.out.println("\u001B[31m" + "Metoda 'add' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + addResult + "\u001B[0m");
        }
        if (subCorrect) {
            System.out.println("Metoda 'sub' działa poprawnie dla a=" + a + " i dla b=" + b);
        } else {
            System.out.println("\u001B[31m" + "Metoda 'sub' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + subResult + "\u001B[0m");
        }
        if (powCorrect) {
            System.out.println("Metoda 'pow' działa poprawnie dla a=" + a + " i dla b=" + b);
        } else {
            System.out.println("\u001B[31m" + "Metoda 'pow' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + powResult + "\u001B[0m");
        }
    }

    public static double numberDouble() {
        System.out.println("Podaj liczbę: ");
        Scanner read = new Scanner(System.in);
        String number = read.nextLine();
        double d;
        try {
            d = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            d = 1.0D;
            System.out.println("Miałeś podać liczbę!!! Za karę podstawiam za tą liczbę '1'");
        }
        return d;
    }
}