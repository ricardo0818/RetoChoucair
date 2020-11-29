package stepDefinition;

import common.frequent;
import common.messages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObject.buyPage;
import pageObject.createAccount;
import pageObject.loginPage;

public class buyPurchaseStepDefinition {

    @Steps(shared = true)
    frequent metodos;

    @Steps(shared = true)
    loginPage login;

    @Steps(shared = true)
    createAccount create;

    @Steps(shared = true)
    buyPage byPage;

    @Steps(shared = true)
    messages messages;

    @When("^user enter data for logIn and buys a garment$")
    public void buyGarment() {
        login.signInButtonPage();
        byPage.buyPurchases();

    }

    @Then("^the system displays the purchase completed message$")
    public void buyCompletedMessage() {
        messages.buyComplete();
    }
}
