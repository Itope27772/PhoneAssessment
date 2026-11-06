package Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class BrowserFactory {

    //Declare our webdriver - static allows you to call the declaration or not to create instance everytime you need to reference it.
    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url){
        boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));

        if (browserChoice.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (isHeadless) {
                options.addArguments("--headless=new");
            }
           // driver = new ChromeDriver(options);
        }else if (browserChoice.equalsIgnoreCase("FireFOx")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }
        // driver.manage().window().maximize();
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1920,1080));
        return driver;
    }


}
