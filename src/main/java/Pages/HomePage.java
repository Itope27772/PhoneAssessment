package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Login']")
    WebElement loginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
       loginButton.click();
    }

}
