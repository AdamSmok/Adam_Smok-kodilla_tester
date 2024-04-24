package com.kodilla.bank.homework;


public class CashMachine {
    public final String name;
    public int[] transactions;
    public int size;
    public int balance = 0;
    public int withdraw = 0;
    public int payment = 0;

    public CashMachine(String name) {
        this.name = name;
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }

    public int getWithdraw() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int withdraw = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) ;
            withdraw -= this.transactions[i];
        }
        return withdraw;
    }

    public int getPayment() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int payment = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) ;
            payment += this.transactions[i];
        }
        return payment;
    }
}