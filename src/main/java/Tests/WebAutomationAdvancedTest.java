package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */

//Call listeners so that the extent report is generated when the test is run from the class level. The listeners can also be called from the testng.xml file.
@Listeners(ExtentReports.Listeners.class)
public class WebAutomationAdvancedTest extends Base {



    @Test
    public void LoginTest() throws InterruptedException {
        Thread.sleep(3000);
        //Take a screenshot before login to capture the state of the application before any actions are performed.
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.setLoginEmail();
        loginPage.setLoginPassword();
        loginPage.clickLoginSubmit();
        takeScreenshots.takeSnapShot(driver, "validLogin");
        Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "AfterLogin");
    }

    @Test (dependsOnMethods = "LoginTest")
    public void landingPageTest() throws InterruptedException {
       // landingPage.verifyLoginSuccess();
        Thread.sleep(1000);
        landingPage.clicklearn();
        landingPage.clickLearningMat();
        Thread.sleep(2000);
    }

    @Test (dependsOnMethods = "landingPageTest")
    public void LearningMatTest() throws InterruptedException {
        learnPage.clickWebAutoAdvance();
        Thread.sleep(2000);
    }

    @Test (dependsOnMethods = "LearningMatTest")
    public void WebAutoAdvanceTest() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "InventoryForm");
        webAutoAdvancedPage.setDeviceType();
        webAutoAdvancedPage.selectBrand();
        webAutoAdvancedPage.selectStorage();
        webAutoAdvancedPage.selectColor();
        webAutoAdvancedPage.setQuantity(2);
        webAutoAdvancedPage.typeAddress("Erf 477, Rocky Crest");
        webAutoAdvancedPage.clickNextButtont();
        //Thread.sleep(4000);
    }

    @Test (dependsOnMethods = "WebAutoAdvanceTest")
    public void WebAutoPage2Test() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "Page2_InventoryForm");
        webAutoAdvancedPage.selectShippingMethod();
        webAutoAdvancedPage.setWarranty();
        webAutoAdvancedPage.enterDiscountCode("SAVE10");
        webAutoAdvancedPage.clickConfirm();
        Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "Confirmed_InventoryForm");
        webAutoAdvancedPage.clickInvoice();
        Thread.sleep(2000);
        webAutoAdvancedPage.openInvoice();
        Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "Final Invoice");

    }

//    @Test (dependsOnMethods = "WebAutoPage2Test")
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}
