package com.kodilla.nowe;

class CashMachine {
    private int[] transactions;
    private int size;
    private static final int cashMachineCount = 3;

    public CashMachine() {
        transactions = new int[cashMachineCount];
        size = 0;
    }

    public void addTransaction(int amount) {
        ensureCapacity();
        transactions[size++] = amount;
    }

    private void ensureCapacity() {
        if (size == transactions.length) {
            int[] newTransactions = new int[2 * transactions.length];
            System.arraycopy(transactions, 0, newTransactions, 0, size);
            transactions = newTransactions;
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < size; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int getTransactionCount() {
        return size;
    }

    public int getWithdrawalTransactionCount() {
        int withdrawalCount = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] < 0) {
                withdrawalCount++;
            }
        }
        return withdrawalCount;
    }

    public int getDepositTransactionCount() {
        int depositCount = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] > 0) {
                depositCount++;
            }
        }
        return depositCount;
    }

    public double getAverageWithdrawal() {
        int withdrawalTotal = 0;
        int withdrawalCount = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] < 0) {
                withdrawalTotal += transactions[i];
                withdrawalCount++;
            }
        }
        return withdrawalCount == 0 ? 0 : (double) withdrawalTotal / withdrawalCount;
    }

    public double getAverageDeposit() {
        int depositTotal = 0;
        int depositCount = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] > 0) {
                depositTotal += transactions[i];
                depositCount++;
            }
        }
        return depositCount == 0 ? 0 : (double) depositTotal / depositCount;
    }
}