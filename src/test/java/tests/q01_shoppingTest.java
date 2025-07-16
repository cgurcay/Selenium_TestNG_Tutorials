package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class q01_shoppingTest {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        testotomasyonuPage.searchBox
                .sendKeys(ConfigReader.getProperty("toSearchKey") + Keys.ENTER);

        testotomasyonuPage.itemList.get(0)
                .click();

        String itemNamePDP = testotomasyonuPage.itemNamePDP.getText();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", testotomasyonuPage.addToCartPDP);
        ReusableMethods.wait(1);

        testotomasyonuPage.buyNowPDP.click();

        String actualNameOnCart = testotomasyonuPage.cartListItem.getText();

        Assert.assertEquals(actualNameOnCart, itemNamePDP);

        Driver.quitDriver();
    }

}
