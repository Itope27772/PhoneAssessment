package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class Base {


    final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homepage = new HomePage(driver);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public TakeScreenshots takeScreenshots = new TakeScreenshots();
    public LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
    public WebAutoAdvancedPage  webAutoAdvancedPage = PageFactory.initElements(driver, WebAutoAdvancedPage.class);

}
