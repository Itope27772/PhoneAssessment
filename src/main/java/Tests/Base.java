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

        BrowserFactory browserFactory = new BrowserFactory();

        final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

        public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        public TakeScreenshots takeScreenshots = new TakeScreenshots();
        public LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
        public WebAutoAdvancedPage webAutoAdvancedPage = PageFactory.initElements(driver, WebAutoAdvancedPage.class);


   // }

}
