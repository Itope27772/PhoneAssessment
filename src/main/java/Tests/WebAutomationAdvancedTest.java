package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class WebAutomationAdvancedTest extends Base {

    @Test
    public void LoginTest() throws InterruptedException {

        homepage.clickLoginButton();
        loginPage.setLoginEmail();
        loginPage.setLoginPassword();
        loginPage.clickLoginSubmit();
        //takeScreenshots.takeSnapShot(driver, "validLogin");
        Thread.sleep(4000);

    }

    @Test (dependsOnMethods = "LoginTest")
    public void landingPageTest() throws InterruptedException {
       // landingPage.verifyLoginSuccess();
        landingPage.clicklearn();
        landingPage.clickLearningMat();
        Thread.sleep(4000);
    }

    @Test (dependsOnMethods = "landingPageTest")
    public void LearningMatTest() throws InterruptedException {
        learnPage.clickWebAutoAdvance();
        Thread.sleep(4000);
    }

    @Test (dependsOnMethods = "LearningMatTest")
    public void WebAutoAdvanceTest() throws InterruptedException {
        webAutoAdvancedPage.setDeviceType();
        webAutoAdvancedPage.selectBrand();
        webAutoAdvancedPage.selectStorage();
        webAutoAdvancedPage.selectColor();
        webAutoAdvancedPage.setQuantity(2);
        webAutoAdvancedPage.typeAddress("Erf 477, Rocky Crest");
        webAutoAdvancedPage.clickNextButtont();
        Thread.sleep(4000);
    }

    @Test (dependsOnMethods = "WebAutoAdvanceTest")
    public void WebAutoPage2Test() throws InterruptedException {
        webAutoAdvancedPage.selectShippingMethod();
        webAutoAdvancedPage.setWarranty();
        webAutoAdvancedPage.enterDiscountCode("SAVE10");
        webAutoAdvancedPage.clickConfirm();
        Thread.sleep(5000);
        webAutoAdvancedPage.clickInvoice();
        Thread.sleep(5000);
        webAutoAdvancedPage.openInvoice();
        Thread.sleep(4000);

    }


}
