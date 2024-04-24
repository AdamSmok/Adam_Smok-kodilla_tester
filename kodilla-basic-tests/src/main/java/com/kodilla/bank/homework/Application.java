package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CashMachine atm1 = new CashMachine("Atm1");
        atm1.add(-2);
        atm1.add(5);
        CashMachine atm2 = new CashMachine("Atm2");
        atm2.add(0);
        atm2.add(3);
        CashMachine atm3 = new CashMachine("Atm3");
        atm3.add(3);
        atm3.add(2);
        System.out.println("getTotalBalance "+bank.getTotalBalance());
        System.out.println("numberOfWithdrawals "+bank.numberOfWithdrawals());
        System.out.println("numberOfDeposits "+bank.numberOfDeposits());
        System.out.println("getAvgWithdrawal "+bank.getAvgWithdrawal());
        System.out.println("getAvgDeposit "+bank.getAvgDeposit());
    }
}
