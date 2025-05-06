package Utils;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;

public class Utils extends RunCucumberTest {
    public static void clicar(WebElement element) {
        element.click();
    }

    public static void digitar(WebElement element, String texto) {
        element.sendKeys(texto);
    }
}
