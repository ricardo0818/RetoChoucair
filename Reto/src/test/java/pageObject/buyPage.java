package pageObject;

import common.frames;
import common.scroll;
import common.waitTime;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Steps;

public class buyPage extends PageObject {



    @Steps(shared = true)
    waitTime time;

    @Steps(shared = true)
    scroll scrolling;

    @Steps(shared = true)
    frames frame;

    @FindBy(how = How.XPATH, using = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    private WebElementFacade btnDresses;

    @FindBy(how = How.XPATH, using = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']")
    private WebElementFacade productDresses;

    @FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']")
    private WebElementFacade viewDresses;


    @FindBy(how = How.XPATH, using = "//a[@title='Add to cart']")
    private WebElementFacade btnAddCar;

    @FindBy(how = How.XPATH, using = "//form[@id='buy_block']//button[@name='Submit']")
    private WebElementFacade boxBuy;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Proceed to checkout')]")
    private WebElementFacade btnCheckout;

    @FindBy(how = How.XPATH, using = "(//a[@title='Proceed to checkout'])[2]")
    private WebElementFacade btnCheckoutCart;

    @FindBy(how = How.NAME, using = "processAddress")
    private WebElementFacade btnCheckoutAddress;

    @FindBy(how = How.XPATH, using = "//p[@class='checkbox']//div[@class='checker']")
    private WebElementFacade chkTerm;

    @FindBy(how = How.NAME, using = "processCarrier")
    private WebElementFacade btnCheckoutCarrier;

    @FindBy(how = How.XPATH, using = "//a[@title='Pay by bank wire']")
    private WebElementFacade btnBank;

    @FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
    private WebElementFacade btnConfirmPay;


    public void buyPurchases(){
        btnDresses.click();
        scrolling.scrollingToElement(productDresses);
        MoveMouse.to(viewDresses);
        productDresses.click();
        btnAddCar.click();

        time.timeSeconds(2);
        scrolling.scrollingToElement(btnCheckout);
        btnCheckout.click();

       /* time.timeSeconds(5);
        System.out.println("presionar el boton checkout2");
        scrolling.scrollingToElement(btnCheckoutCart);
        btnCheckoutCart.click();
        System.out.println("se presiono el boton checkout2");*/

        scrolling.scrollingToElement(btnCheckoutCart);
        btnCheckoutCart.click();

        scrolling.scrollingToElement(btnCheckoutAddress);
        btnCheckoutAddress.click();

        scrolling.scrollingToElement(btnCheckoutCarrier);
        chkTerm.click();
        btnCheckoutCarrier.click();

        scrolling.scrollingToElement(btnBank);
        btnBank.click();

        time.timeSeconds(2);
        scrolling.scrollingToElement(btnConfirmPay);
        btnConfirmPay.click();
    }
}
