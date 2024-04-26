package com.kodilla.nowe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void testGetTotalBalance() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-20);
        cashMachine2.addTransaction(200);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(230, bank.getTotalBalance());
    }

    @Test
    public void testGetTotalWithdrawalTransactionCount() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-20);
        cashMachine2.addTransaction(200);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(2, bank.getTotalWithdrawalTransactionCount());
    }

    @Test
    public void testGetTotalDepositTransactionCount() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-20);
        cashMachine2.addTransaction(200);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(2, bank.getTotalDepositTransactionCount());
    }

    @Test
    public void testGetAverageWithdrawal() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-30);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-20);
        cashMachine2.addTransaction(-40);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(-35, bank.getAverageWithdrawal());
    }

    @Test
    public void testGetAverageDeposit() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(200);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-20);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(300);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(225, bank.getAverageDeposit());
    }
}