package stepDefinition;

import common.frequent;
import common.messages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObject.createAccount;
import pageObject.loginPage;

public class createAccountStepDefinition {

    @Steps(shared = true)
    frequent metodos;

    @Steps(shared = true)
    loginPage login;

    @Steps(shared = true)
    createAccount create;

    @Steps(shared = true)
    messages messages;

    @Given("^user is on the home page$")
    public void homePage() {
        metodos.openPage();
    }

    @When("^user enter data for create an account$")
    public void optionSignIn() {
        create.Account();

    }

    @Then("^the system create an account$")
    public void screenLoginOrRegister() {
        messages.account();
    }


}
