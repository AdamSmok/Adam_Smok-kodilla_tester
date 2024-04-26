package com.kodilla.nowe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {

    private CashMachine cashMachine;

    @BeforeEach
    public void setUp() {
        cashMachine = new CashMachine();
    }

    @Test
    public void testAddTransaction() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(3, cashMachine.getTransactionCount());
    }

    @Test
    public void testGetBalance() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(250, cashMachine.getBalance());
    }

    @Test
    public void testGetWithdrawalTransactionCount() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(1, cashMachine.getWithdrawalTransactionCount());
    }

    @Test
    public void testGetDepositTransactionCount() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(2, cashMachine.getDepositTransactionCount());
    }

    @Test
    public void testGetAverageWithdrawal() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-30);
        assertEquals(-40, cashMachine.getAverageWithdrawal());
    }

    @Test
    public void testGetAverageDeposit() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(150, cashMachine.getAverageDeposit());
    }
}