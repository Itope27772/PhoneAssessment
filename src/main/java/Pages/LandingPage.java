package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='My Learning']")
    WebElement myLearningTab;

    @FindBy(xpath = "//button/span[text()='Logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//span[contains(text(),'Learn')]")
    WebElement learnButton;

    @FindBy(xpath = "//span[text()='Learning Materials']")
    WebElement learningMaterials;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginSuccess() {
        myLearningTab.isDisplayed();
    }

    public void clicklearn(){
        learnButton.click();
    }
    public void clickLearningMat(){
        learningMaterials.click();
    }

    public void logout(){
        logoutButton.click();
    }


}
