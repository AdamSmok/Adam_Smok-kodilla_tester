package com.kodilla.nowe;

public class Main {
    public static void main(String[] args) {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);


        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-20);
        cashMachine2.addTransaction(200);


        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        System.out.println("Całkowity bilans banku: " + bank.getTotalBalance());
        System.out.println("Liczba transakcji związanych z wypłatą: " + bank.getTotalWithdrawalTransactionCount());
        System.out.println("Liczba transakcji związanych z wpłatą: " + bank.getTotalDepositTransactionCount());
        System.out.println("Średnia wartość wypłaty: " + bank.getAverageWithdrawal());
        System.out.println("Średnia wartość wpłaty: " + bank.getAverageDeposit());
    }
}