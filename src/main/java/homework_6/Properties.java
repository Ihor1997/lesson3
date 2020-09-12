package main.java.homework_6;

import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Properties {

    protected WebDriver driver;
    String laptopPage = "https://rozetka.com.ua/notebooks/c80004/";
    protected By elValue = By.cssSelector("span[class = 'goods-tile__title']");



   // @Parameters({"browser"})
    @BeforeMethod
    public void setUp(ITestContext testContext) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //FirefoxOptions ffoptions = new FirefoxOptions();
        //driver = new ChromeDriver(options);

        try {

            driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), options);

//            if(browser.equalsIgnoreCase("chrome"))
//            {
//                driver = new RemoteWebDriver(new URL(""), DesiredCapabilities.chrome());
//                driver.manage().window().maximize();
//            }
//            else if(browser.equalsIgnoreCase("firefox")){
//                driver = new RemoteWebDriver(new URL(""), DesiredCapabilities.firefox());
//                driver.manage().window().maximize();
//            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        testContext.setAttribute("driver", driver);
    }





    @AfterMethod
    public void tearDown(ITestContext result) {
//        Screenshot screenshot = new Screenshot(driver);
//        screenshot.makeScreenshot(result);
        result.setAttribute("driver", driver);
        performedActions();
        saveScreenshot(result);
        driver.quit();
    }

    @Attachment
    public String performedActions(){
        return "Hello I am a string";
    }

    @Attachment(value = "Page screenshot", type = "image/pmg")
    public byte[] saveScreenshot(ITestContext testContext){
        WebDriver driver = (WebDriver) testContext.getAttribute("driver");
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


}


