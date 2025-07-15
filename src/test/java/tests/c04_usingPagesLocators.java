package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemowebshopPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class c04_usingPagesLocators {

    DemowebshopPage demowebshopPage = new DemowebshopPage();

    @Test
    public void test01() {

        Driver.getDriver().get("https://demowebshop.tricentis.com/");

        demowebshopPage.searchBox.sendKeys("phone" + Keys.ENTER);

        demowebshopPage
                .itemList
                .get(0)
                .click();

        String expectedUrl = "demowebshop";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Test (dependsOnMethods = "test01")
    public void test02() {

        String expectedName = "phone";
        String actualName = demowebshopPage
                                    .itemNamePDP
                                    .getText()
                                    .toLowerCase();

        Assert.assertTrue(actualName.contains(expectedName));

        Driver.quitDriver();
    }

}
