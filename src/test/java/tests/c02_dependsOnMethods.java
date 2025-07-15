package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class c02_dependsOnMethods {

    // Go to https://testotomasyonu.com
    // search for a phone
    // check if phone returns as a first item

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void mainPageTest(){
        driver.get("https://testotomasyonu.com");

        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Test (dependsOnMethods = "mainPageTest")
    public void searchTest(){
        driver.findElement(By.id("global-search"))
                .sendKeys("phone" + Keys.ENTER);
    }

    @Test (dependsOnMethods = "searchTest")
    public void checkFirstItemTest(){
        String expectedName = "phone";
        String actualName = driver.findElement(By.xpath("(//div[@id='shopping-list']//li)[1]")).getText();

        Assert.assertTrue(actualName.toLowerCase().contains(expectedName));
    }

}
