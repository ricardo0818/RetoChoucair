package common;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.thucydides.core.pages.PageObject;

public class frames extends PageObject {

    public void frameDefect(){
        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame("//div[@class='columns-container']");
    }

    public void frameInicial(){
        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame("//div[@class='nav']");
    }

    public void submit(){
        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame("Submit");
    }

    public static Performable toFrame(int index){
        return new DriverTask(webDriver -> webDriver.switchTo().frame(index));
    }
}
