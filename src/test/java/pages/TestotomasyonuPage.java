package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestotomasyonuPage {

    // https://testotomasyonu.com/

    public TestotomasyonuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "global-search")
    public WebElement searchBox;

    @FindBy (xpath = "(//*[.='Account'])[1]")
    public WebElement accountButton;

    @FindBy (xpath = "(//*[.='Your Cart'])[1]")
    public WebElement yourCartButton;

    @FindBy (id = "email")
    public WebElement loginPageEmailBox;

    @FindBy (id = "password")
    public WebElement loginPagePasswordBox;

    @FindBy (id = "submitlogin")
    public WebElement loginPageSubmitButton;

    @FindBy (xpath = "//*[@class='product-gird ']//li")
    public List<WebElement> itemList;

    @FindBy (xpath = "//*[@class=' heading-sm mb-4']")
    public WebElement itemNamePDP;

    @FindBy (xpath = "//*[@class='add-to-cart']")
    public WebElement addToCartPDP;

    @FindBy (xpath = "//*[@class='add-to-cart buy-now']")
    public WebElement buyNowPDP;
    @FindBy (xpath = "//*[@class='product-title text-center']")
    public WebElement cartListItem;

}
