package Utils;

import Runners.RunCucumberTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils extends RunCucumberTest {
    public static void clicar(WebElement element) {
        element.click();
    }

    public static void digitar(WebElement element, String texto) {
        element.sendKeys(texto);
    }

    public static void esperarElementoAparecer(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void esperarElementoDesaparecer(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void selecionarComboBox(WebElement element, String texto) {
        Select listaSuspensa = new Select(element);
        listaSuspensa.selectByVisibleText(texto);
    }

    public static void validarPopUp() throws InterruptedException {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
}
