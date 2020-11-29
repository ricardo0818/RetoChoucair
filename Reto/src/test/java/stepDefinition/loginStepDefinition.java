package stepDefinition;

import common.messages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObject.loginPage;

public class loginStepDefinition {

    @Steps(shared = true)
    loginPage login;

    @Steps(shared = true)
    messages messages;

    @When("^user enter data for sign in$")
    public void userEnterData() {
        login.signInButtonPage();
    }

    @Then("^the system log in$")
    public void logIn() {
        messages.account();
    }



}
