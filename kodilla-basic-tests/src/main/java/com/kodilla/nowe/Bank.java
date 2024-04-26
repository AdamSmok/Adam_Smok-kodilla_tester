package com.kodilla.nowe;
class Bank {
    private CashMachine[] cashMachines;
    private int size;
    private static final int cashMachineCount = 3;

    public Bank() {
        cashMachines = new CashMachine[cashMachineCount];
        size = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        ensureCapacity();
        cashMachines[size++] = cashMachine;
    }

    private void ensureCapacity() {
        if (size == cashMachines.length) {
            CashMachine[] newCashMachines = new CashMachine[2 * cashMachines.length];
            System.arraycopy(cashMachines, 0, newCashMachines, 0, size);
            cashMachines = newCashMachines;
        }
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < size; i++) {
            totalBalance += cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawalTransactionCount() {
        int totalWithdrawalCount = 0;
        for (int i = 0; i < size; i++) {
            totalWithdrawalCount += cashMachines[i].getWithdrawalTransactionCount();
        }
        return totalWithdrawalCount;
    }

    public int getTotalDepositTransactionCount() {
        int totalDepositCount = 0;
        for (int i = 0; i < size; i++) {
            totalDepositCount += cashMachines[i].getDepositTransactionCount();
        }
        return totalDepositCount;
    }

    public double getAverageWithdrawal() {
        int totalWithdrawalTotal = 0;
        int totalWithdrawalCount = 0;
        for (int i = 0; i < size; i++) {
            totalWithdrawalTotal += cashMachines[i].getWithdrawalTransactionCount() * cashMachines[i].getAverageWithdrawal();
            totalWithdrawalCount += cashMachines[i].getWithdrawalTransactionCount();
        }
        return totalWithdrawalCount == 0 ? 0 : (double) totalWithdrawalTotal / totalWithdrawalCount;
    }

    public double getAverageDeposit() {
        int totalDepositTotal = 0;
        int totalDepositCount = 0;
        for (int i = 0; i < size; i++) {
            totalDepositTotal += cashMachines[i].getDepositTransactionCount() * cashMachines[i].getAverageDeposit();
            totalDepositCount += cashMachines[i].getDepositTransactionCount();
        }
        return totalDepositCount == 0 ? 0 : (double) totalDepositTotal / totalDepositCount;
    }
}
