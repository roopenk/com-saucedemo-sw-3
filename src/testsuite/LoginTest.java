package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    //Opening the browser
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnTheElement(By.id("login-button"));
        getTextFromElement(By.xpath("//span[text()='Products']"));
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnTheElement(By.id("login-button"));
        int expectedNumberOfProducts = 6;
        int actualNumberOfProducts = driver.findElements(By.className("inventory_item")).size();
        Assert.assertEquals("Number Of Products Mismatched", expectedNumberOfProducts, actualNumberOfProducts);
    }

    @After
    // Closing the browser
    public void cutOff() {
        closeBrowser();
    }
}
