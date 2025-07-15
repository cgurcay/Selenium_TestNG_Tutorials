package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class c03_usingDriverClass {

    @Test
    public void test01(){
        Driver.getDriver().get("https://testotomasyonu.com");

        String expectedUrl = "testotomasyonu";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

        Driver.quitDriver();
    }

    @Test
    public void test02(){

        Driver.getDriver().get("https://wisequarter.com");

        String expectedTitle = "Wise Quarter";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Driver.quitDriver();
    }

}
