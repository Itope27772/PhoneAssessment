package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class TakeScreenshots {

    String screenshotPath = System.getProperty("user.dir") + "/target/screenshots";

    public void takeSnapShot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotPath, screenshotName + ".png");
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
