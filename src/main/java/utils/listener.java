package main.java.utils;

import org.openqa.selenium.WebDriver;
import org.testng.*;
import test.java.utils.Screenshot;

public class listener implements ISuiteListener, ITestListener, IInvokedMethodListener {


    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("Invoked " + iInvokedMethod.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("Invoked " + iInvokedMethod.getTestMethod().getMethodName());
    }

    @Override
    public void onStart(ISuite iSuite) {

    }

    @Override
    public void onFinish(ISuite iSuite) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("--------Test started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test finished successfuly");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestContext testContext = result.getTestContext();
        WebDriver driver = (WebDriver) testContext.getAttribute("driver");
        Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenshot(result);
        System.out.println("Test finished with failure");
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
