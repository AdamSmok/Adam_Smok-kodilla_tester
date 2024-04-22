package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 6;
        int b = 8;
        int addResult = calc.add(a, b);
        int subResult = calc.sub(a, b);
        int powResult = calc.pow(a, b);
        boolean addCorrect = ResultChecker.assertEquals(a + b, addResult);
        boolean subCorrect = ResultChecker.assertEquals(a - b, subResult);
        boolean powCorrect = ResultChecker.assertEquals((int) Math.pow(a, b), powResult);
        if (addCorrect) {
            System.out.println("Metoda 'add' działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + addResult);
        } else {
            System.out.println("Metoda 'add' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + addResult);
        }
        if (subCorrect) {
            System.out.println("Metoda 'sub' działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + subResult);
        } else {
            System.out.println("Metoda 'sub' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + subResult);
        }
        if (powCorrect) {
            System.out.println("Metoda 'pow' działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + powResult);
        } else {
            System.out.println("Metoda 'pow' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + powResult);
        }
    }
}