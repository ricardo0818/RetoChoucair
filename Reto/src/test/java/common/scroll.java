package common;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class scroll extends PageObject {

    public void scrollingToElement(WebElement element){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();",element);
    }
}
