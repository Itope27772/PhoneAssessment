package Utils;

import org.openqa.selenium.WebDriver;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class BrowserFactory {

    //Declare our webdriver - static allows you to call the declaration or not to create instance everytime you need to reference it.
    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url){
        if(browserChoice.equalsIgnoreCase("chrome")){
            driver = new org.openqa.selenium.chrome.ChromeDriver();
        } else if (browserChoice.equalsIgnoreCase("edge")) {
            driver = new org.openqa.selenium.edge.EdgeDriver();
        } else {
            driver = new org.openqa.selenium.firefox.FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }


}
