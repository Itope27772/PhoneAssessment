package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class Base {


    WebDriver driver;

    public HomePage homepage;
    public LoginPage loginPage;
    public LandingPage landingPage;
    public TakeScreenshots takeScreenshots = new TakeScreenshots();
    public LearnPage learnPage;
    public WebAutoAdvancedPage webAutoAdvancedPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        String baseUrl = System.getProperty("baseUrl", "https://ndosisimplifiedautomation.vercel.app/");
        driver = BrowserFactory.startBrowser("chrome", baseUrl);
        homepage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        learnPage = PageFactory.initElements(driver, LearnPage.class);
        webAutoAdvancedPage = PageFactory.initElements(driver, WebAutoAdvancedPage.class);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
