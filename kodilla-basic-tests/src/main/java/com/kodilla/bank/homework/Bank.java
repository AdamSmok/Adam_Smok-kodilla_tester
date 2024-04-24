package com.kodilla.bank.homework;

public class Bank {

    public  CashMachine[] cashMachine;

    public int getTotalBalance() {
        int balance = 0;

        for (int i = 0; i < cashMachine.length; i++) {
            CashMachine temp = cashMachine[i];
            if (temp != null) {
                balance += temp.getBalance();
            }
        }
        System.out.println("balance " + balance);
        return balance;
    }

    public int numberOfWithdrawals() {
        int count = 0;
        int[] trasactions = null;
        for (int i = 0; i < cashMachine.length; i++) {
            CashMachine temp = cashMachine[i];
            if (temp != null) {
                trasactions = temp.getTransactions();
                for (int j = 0; j < trasactions.length; j++) {
                    if (trasactions[j] < 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("count of withdrawals " + count);
        return count;
    }

    public int numberOfDeposits() {
        int count = 0;
        int[] trasactions = null;
        for (int i = 0; i < cashMachine.length; i++) {
            CashMachine temp = cashMachine[i];
            if (temp != null) {
                trasactions = temp.getTransactions();
                for (int j = 0; j < trasactions.length; j++) {
                    if (trasactions[j] > 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("count of depisits " + count);
        return count;
    }

    public double getAvgWithdrawal() {
        int numberOfWithdrawals = 0;
        int[] trasactions = null;
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            CashMachine temp = cashMachine[i];
            if (temp != null) {
                trasactions = temp.getTransactions();
                for (int j = 0; j < trasactions.length; j++) {
                    if (trasactions[j] < 0) {
                        numberOfWithdrawals = +trasactions[j];
                        count++;
                    }
                }
            }
        }
        System.out.println("average withdrawal "+numberOfWithdrawals / count);
        return numberOfWithdrawals / count;
    }

    public double getAvgDeposit() {
        int numberOfDeposits = 0;
        int[] trasactions = null;
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            CashMachine temp = cashMachine[i];
            if (temp != null) {
                trasactions = temp.getTransactions();
                for (int j = 0; j < trasactions.length; j++) {
                    if (trasactions[j] > 0) {
                        numberOfDeposits = +trasactions[j];
                        count++;
                    }
                }
            }
        }
        System.out.println("average deposit "+numberOfDeposits / count);
        return numberOfDeposits / count;
    }
}
/*
całkowity bilans ze wszystkich bankomatów,
liczbę transakcji związanych z wypłatą,
liczbę transakcji związaną z wpłatą pieniędzy,
średnią wartość wypłaty,
średnią wartość wpłaty.*/