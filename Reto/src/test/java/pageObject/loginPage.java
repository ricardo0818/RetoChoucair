package pageObject;

import common.waitTime;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class loginPage extends PageObject {

    @Steps(shared = true)
    waitTime time;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]")
    private WebElementFacade btnSignIn;

    @FindBy(how = How.ID, using = "email")
    private WebElementFacade txtEmail;

    @FindBy(how = How.ID, using = "passwd")
    private WebElementFacade txtPassword;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElementFacade btnLogin;



    public void signInButtonPage() {
        btnSignIn.click();
        txtEmail.sendKeys("ricardogomezg18@gmail.com");
        txtPassword.sendKeys("12345");
        btnLogin.click();
    }
}
