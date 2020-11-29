package pageObject;

import common.scroll;
import common.waitTime;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class createAccount extends PageObject {

    @Steps(shared = true)
    waitTime time;

    @Steps(shared = true)
    scroll scrolling;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]")
    private WebElementFacade btnSignIn;

    @FindBy(how = How.ID, using = "email_create")
    private WebElementFacade txtEmail;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElementFacade btnCreateAcc;

    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElementFacade txtFirstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElementFacade txtLastName;

    @FindBy(how = How.ID, using = "passwd")
    private WebElementFacade txtPassword;

    @FindBy(how = How.ID, using = "address1")
    private WebElementFacade txtAddress;

    @FindBy(how = How.ID, using = "city")
    private WebElementFacade txtCity;

    @FindBy(how = How.XPATH, using = "//div[@id='uniform-id_state']")
    private WebElementFacade selState;

    @FindBy(how = How.XPATH, using = "//select[@id='id_state']//option[contains(text(),'Alabama')]")
    private WebElementFacade optState;

    @FindBy(how = How.ID, using = "postcode")
    private WebElementFacade txtPostCode;

    @FindBy(how = How.ID, using = "id_country")
    private WebElementFacade txtCountry;

    @FindBy(how = How.ID, using = "alias")
    private WebElementFacade txtAlias;

    @FindBy(how = How.ID, using = "phone")
    private WebElementFacade txtPhone;

    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElementFacade txtMobile;

    @FindBy(how = How.ID, using = "submitAccount")
    private WebElementFacade btnRegister;


    public void Account(){

        btnSignIn.click();

        txtEmail.sendKeys("sms95460@bcaoo.com");
        btnCreateAcc.click();

        scrolling.scrollingToElement(txtFirstName);
        txtFirstName.sendKeys("Ricardo");

        scrolling.scrollingToElement(txtLastName);
        txtLastName.sendKeys("Gomez");

        scrolling.scrollingToElement(txtPassword);
        txtPassword.sendKeys("123456");

        scrolling.scrollingToElement(txtAddress);
        txtAddress.sendKeys("Cra 10 # 123");

        scrolling.scrollingToElement(txtCity);
        txtCity.sendKeys("Medellin");

        scrolling.scrollingToElement(optState);
        selState.click();

        optState.click();

        scrolling.scrollingToElement(txtPostCode);
        txtPostCode.sendKeys("00000");

        scrolling.scrollingToElement(txtPhone);
        txtPhone.sendKeys("31677777");

        scrolling.scrollingToElement(txtMobile);
        txtMobile.sendKeys("31677777");

        scrolling.scrollingToElement(txtAlias);
        txtAlias.sendKeys("blanca");

        btnRegister.click();
        //time.timeSeconds(5);
    }


}
