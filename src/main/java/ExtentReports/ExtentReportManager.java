package ExtentReports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class ExtentReportManager {

    static String reportPath = System.getProperty("user.dir") + "/target/Report/Ndosi Test Report"  + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new java.util.Date()) + ".html";

    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentSparkReporter;
    static String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new java.util.Date());

    public static ExtentReports extentSetup() {
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(reportPath);
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
        extentSparkReporter.config().setReportName("Phone Assessment Test Report");
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Execution Machine", System.getProperty("user.name"));

        return extentReports;
       }
    }
