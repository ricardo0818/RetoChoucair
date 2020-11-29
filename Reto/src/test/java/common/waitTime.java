package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitTime {

    WebDriver driver;

    public void TiempoPruebas(WebDriver driver) {

        this.driver = driver;
    }

    public void timeElement(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    public void timeSeconds(int segundos) {
        try {
            Thread.sleep(TimeUnit.MILLISECONDS.convert(segundos, TimeUnit.SECONDS));
        } catch (Exception e) {
            System.err.println("Error en la espera "+e);
        }

    }
}
