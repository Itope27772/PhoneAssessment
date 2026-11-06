package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class LoginPage {


    WebDriver driver;

    @FindBy(id = "login-email")
    static WebElement loginEmail;

    @FindBy(id = "login-password")
    static WebElement loginPassword;

    @FindBy(id = "login-submit")
    static WebElement loginSubmit;

    public void loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void setLoginEmail(){
        loginEmail.sendKeys("itopeprinting@gmail.com");
    }

    public static void setLoginPassword() {
        loginPassword.sendKeys("Password@123");
    }

    public static void clickLoginSubmit(){
        loginSubmit.click();
    }

}
