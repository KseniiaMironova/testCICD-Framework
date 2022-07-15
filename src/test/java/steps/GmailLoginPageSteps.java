package steps;

import flows.GmailLoginPageFlow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webdriver.WebDriverSingleton;

public class GmailLoginPageSteps {

    protected GmailLoginPageFlow gmailLoginPageFlow = new GmailLoginPageFlow(WebDriverSingleton.getDriver());

    //Given actions
    @Given("I on gmail sign in page")
    public void goToMainPage () {
        gmailLoginPageFlow.goToMainPage();
    }

    //When actions
    @When("I enter {string} in email field")
    public void enterTextInEmailField (String email) {
        gmailLoginPageFlow.enterTextInEmailField(email);
    }

    @And("I click Next button")
    public void clickNextButton () {
        gmailLoginPageFlow.clickNextButton();
    }

    @And("I enter {string} in password field")
    public void enterTextInPasswordField (String password) {
        gmailLoginPageFlow.enterTextInPasswordField(password);
    }

    //Then actions
    @Then("I on my account page")
    public void assertThatPageIsMyAccountPage () {
        gmailLoginPageFlow.assertThatPageIsMyAccountPage();
    }
}
