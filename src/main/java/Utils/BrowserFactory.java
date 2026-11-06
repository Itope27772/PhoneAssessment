package Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class BrowserFactory {

    public static WebDriver startBrowser(String browserChoice, String url){
        boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));
        WebDriver driver;

        if (browserChoice.equalsIgnoreCase("Chrome")) {

            ChromeOptions options = new ChromeOptions();

            if (isHeadless) {
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1920,1080");
            }

            driver = new ChromeDriver(options);
        }
            else if (browserChoice.equalsIgnoreCase("FireFOx")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }
        // driver.manage().window().maximize();
        try {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.get(url);
            driver.manage().window().setSize(new Dimension(1920,1080));
            return driver;
        } catch (WebDriverException exception) {
            try {
                driver.quit();
            } catch (WebDriverException cleanupException) {
                exception.addSuppressed(cleanupException);
            }
            throw exception;
        }
    }


}
