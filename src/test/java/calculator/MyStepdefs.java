package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyStepdefs {
    Calculator calculator;
    int value1;
    int value2;
    int divisionResult;
    int result;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void getTwoNumbers(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I divide first value by second value$")
    public void divideNumbers() {
        divisionResult = calculator.divide(value1, value2);

    }

    @Then("^I get the root$")
    public void getRoot() {
        result = calculator.root(divisionResult);

    }


    @Then("^I expect the result (\\d+)$")
    public void assertResult(int arg0) {
        Assert.assertEquals(result, arg0);
    }

}
