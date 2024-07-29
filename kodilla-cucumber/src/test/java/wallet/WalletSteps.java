package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private Wallet wallet;
    private CashSlot cashSlot;
    private String notification;

    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_in_my_wallet(int initialBalance) {
        wallet = new Wallet();
        cashSlot = new CashSlot();
        wallet.deposit(initialBalance);
        Assertions.assertEquals(initialBalance, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request {int}")
    public void i_request(int amount) {
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

    @Then("{int} should be dispensed")
    public void should_be_dispensed(int dispensedAmount) {
        Assertions.assertEquals(dispensedAmount, cashSlot.getContents());
    }

    @Then("my wallet balance should be {int}")
    public void my_wallet_balance_should_be(int finalBalance) {
        Assertions.assertEquals(finalBalance, wallet.getBalance());
    }

    @Then("I should be notified of {string}")
    public void i_should_be_notified_of(String expectedNotification) {
        Assertions.assertEquals(expectedNotification, notification);
    }
}