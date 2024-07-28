package homework14_2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static homework14_2.NumberChecker.play;

public class IsItFizzBuzzSteps {
    private int number;
    private String result;

    @Given("the number is {int}")
    public void the_number_is(int number) {
        this.number = number;
    }

    @When("Checking number")
    public void i_play_fizzbuzz() {
        this.result = play(this.number);
    }

    @Then("I should get {string}")
    public void i_should_get(String expectedResult) {
        assertEquals(expectedResult, this.result);
    }
}