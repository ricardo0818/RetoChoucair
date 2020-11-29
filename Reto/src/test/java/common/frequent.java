package common;

import net.serenitybdd.core.pages.PageObject;

public class frequent extends PageObject {

    public void openPage() {
        setDefaultBaseUrl("http://automationpractice.com/index.php");
        open();
    }
}
