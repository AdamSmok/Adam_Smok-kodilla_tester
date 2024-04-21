package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 2;
        int b = 10;
        int addResult = calc.add(a, b);
        int subResult = calc.sub(a, b);
        int powResult = calc.pow(a, b);
        boolean addCorrect = ResultChecker.assertEquals(a + b, addResult);
        boolean subCorrect = ResultChecker.assertEquals(a - b, subResult);
        boolean powCorrect = ResultChecker.assertEquals((int) Math.pow(a, b), powResult);
        if (addCorrect) {
            System.out.println("Motoda 'add' działa poprawnie dla a=" + a + " i dla b=" + b);
        } else {
            System.out.println("Motoda 'add' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + addResult);
        }
        if (subCorrect) {
            System.out.println("Motoda 'sub' działa poprawnie dla a=" + a + " i dla b=" + b);
        } else {
            System.out.println("Motoda 'sub' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + subResult);
        }
        if (powCorrect) {
            System.out.println("Motoda 'pow' działa poprawnie dla a=" + a + " i dla b=" + b);
        } else {
            System.out.println("\u001B[31m"+"Motoda 'pow' nie działa poprawnie dla a=" + a + " i dla b=" + b + " Zwrócony wynik to: " + powResult+"\u001B[0m");
        }
    }
}