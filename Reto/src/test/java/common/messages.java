package common;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class messages extends PageObject {

    @Steps(shared = true)
    scroll scrolling;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My account')]")
    private WebElementFacade msnSuccessfulLogin;

    @FindBy(how = How.XPATH, using = "//p[@class='cheque-indent']")
    private WebElementFacade msnSuccessfulPurchase;

    public void account(){

        String msnExpectedLogin = "My account";

        Assert.assertEquals(msnExpectedLogin.toUpperCase(),msnSuccessfulLogin.getText().toUpperCase());
    }


    public void buyComplete(){

        String msnExpected = "Your order on My Store is complete.";

        scrolling.scrollingToElement(msnSuccessfulPurchase);
        Assert.assertEquals(msnExpected.toUpperCase(),msnSuccessfulPurchase.getText().toUpperCase());
    }


}
