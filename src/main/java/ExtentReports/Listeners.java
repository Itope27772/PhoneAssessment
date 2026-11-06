package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class Listeners implements ITestListener {

    private static ExtentReports extent = new ExtentReports();
    private ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.fail("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.skip("Test skipped");
    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();
    }

    public void onStart(ITestContext result) {
       extent = ExtentReportManager.extentSetup();
    }

}
