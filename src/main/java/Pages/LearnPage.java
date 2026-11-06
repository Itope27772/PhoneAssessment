package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class LearnPage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Web Automation Advance']")
    WebElement WebAutoAdvance;


    public void clickWebAutoAdvance(){
        WebAutoAdvance.click();
    }
}
