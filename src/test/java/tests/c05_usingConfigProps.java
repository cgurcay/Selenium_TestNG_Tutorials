package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class c05_usingConfigProps {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test
    public void loginTest(){

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        testotomasyonuPage.accountButton
                .click();

        testotomasyonuPage.loginPageEmailBox
                .sendKeys(ConfigReader.getProperty("toEmail"));

        testotomasyonuPage.loginPagePasswordBox
                .sendKeys(ConfigReader.getProperty("toPassword"));

        testotomasyonuPage.loginPageSubmitButton
                .click();

        Assert.assertTrue(testotomasyonuPage.loginPageEmailBox.isDisplayed());

    }

}
