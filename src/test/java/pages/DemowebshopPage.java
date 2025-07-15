package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemowebshopPage {

    // https://demowebshop.tricentis.com/

    public DemowebshopPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="small-searchterms")
    public WebElement searchBox;

    @FindBy (className = "product-item")
    public List<WebElement> itemList;

    @FindBy (xpath = "//*[@itemprop='name']")
    public WebElement itemNamePDP;

}
