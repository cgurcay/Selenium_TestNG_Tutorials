package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestotomasyonuPage {

    // https://testotomasyonu.com/

    public TestotomasyonuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "global-search")
    public WebElement searchBox;

    @FindBy (xpath = "(//*[.='Account'])[1]")
    public WebElement accountButton;

    @FindBy (id = "email")
    public WebElement loginPageEmailBox;

    @FindBy (id = "password")
    public WebElement loginPagePasswordBox;

    @FindBy (id = "submitlogin")
    public WebElement loginPageSubmitButton;


}
