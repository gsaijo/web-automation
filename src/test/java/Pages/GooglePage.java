package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.digitar;

public class GooglePage extends RunCucumberTest {

    @FindBy(id = "input")
    private WebElement barraDeBusca;
    
    @FindBy(css = "div.gb_Cd.gb_Zd.gb_xd > div:nth-child(1) > div > div:nth-child(1) > a")
    private WebElement btnEmail;

    @FindBy(xpath = "//a[@data-pid='2']")
    public WebElement btnImagens;

    public void GooglePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void digitarNaBarraDeBusca() {
        barraDeBusca.sendKeys("Teste de velocidade");
        digitar(barraDeBusca, "Teste de velocidade");
    }
}
