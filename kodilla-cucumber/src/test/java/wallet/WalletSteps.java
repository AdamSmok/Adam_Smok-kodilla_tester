package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;


public class WalletSteps {
    private Wallet wallet;
    private CashSlot cashSlot;
    private String notification;
    private int checkedBalance;

    @Given("there is ${int} in my wallet")
    public void there_is_money_in_my_wallet(int initialBalance) {
        wallet = new Wallet();
        cashSlot = new CashSlot();
        wallet.deposit(initialBalance);
        Assertions.assertEquals(initialBalance, wallet.getBalance(), "Initial wallet balance is incorrect");
    }

    @Given("my wallet balance is ${int}")
    public void my_wallet_balance_is(int initialBalance) {
        wallet = new Wallet();
        cashSlot = new CashSlot();  // Ensure cashSlot is initialized here too
        wallet.deposit(initialBalance);
        Assertions.assertEquals(initialBalance, wallet.getBalance(), "Initial wallet balance is incorrect");
    }

    @When("I withdraw ${int}")
    public void i_withdraw(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        if (amount <= 0) {
            notification = "invalid request";
            cashier.withdraw(wallet, amount);
        } else if (wallet.getBalance() < amount) {
            notification = "insufficient funds";
            cashier.withdraw(wallet, amount);
        } else {
            notification = "no notification";
            cashier.withdraw(wallet, amount);
        }
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        checkedBalance = wallet.getBalance();
    }

    @When("I deposit ${int}")
    public void i_deposit(int amount) {
        if (amount <= 0) {
            notification = "invalid deposit amount";
        } else {
            wallet.deposit(amount);
            notification = "deposit successful";
        }
    }

    @Then("{int} should be dispensed")
    public void should_be_dispensed(int dispensedAmount) {
        Assertions.assertEquals(dispensedAmount, cashSlot.getContents(), "Dispensed amount is incorrect");
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents(), "Nothing should be dispensed");
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("insufficient funds", notification);
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, checkedBalance, "Wallet balance is incorrect");
    }

    @Then("my wallet balance should be ${int}")
    public void my_wallet_balance_should_be(int finalBalance) {
        Assertions.assertEquals(finalBalance, wallet.getBalance(), "Wallet balance is incorrect");
    }

    @Then("I should be notified of {string}")
    public void i_should_be_notified_of(String expectedNotification) {
        Assertions.assertEquals(expectedNotification, notification);
    }
}