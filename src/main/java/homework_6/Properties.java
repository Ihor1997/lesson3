package main.java.homework_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import test.java.utils.Screenshot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Properties {

    WebDriver driver;
    String laptopPage = "https://rozetka.com.ua/notebooks/c80004/";
    By elValue = By.cssSelector("span[class = 'goods-tile__title']");



    @Parameters({"Port"})
    @BeforeMethod
    public void setUp(ITestContext testContext, String Port) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        FirefoxOptions ffoptions = new FirefoxOptions();
        // driver = new ChromeDriver(options);
        try {
            if(Port.equalsIgnoreCase("9001"))
            {
                driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), DesiredCapabilities.chrome());
                driver.manage().window().maximize();
            }
            else if(Port.equalsIgnoreCase("9002")){
                driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), DesiredCapabilities.firefox());
                driver.manage().window().maximize();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
//        driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        testContext.setAttribute("driver", driver);
    }





    @AfterMethod
    public void tearDown(ITestResult result) {
        Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenshot(result);
        driver.quit();
    }

}


