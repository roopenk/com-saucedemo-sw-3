package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    public void clickOnTheElement(By by) { // Method to click on the element supplied with "by" variable
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text) { // Method to send the text to element
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) { // Method to get text from the element
        return driver.findElement(by).getText();
    }

    // Select Class methods
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text); // Selecting by visible text
    }
    //************************* Alert Methods *****************************************************

}
