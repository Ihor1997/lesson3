package test.java.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseSetUp {

    WebDriver driver;

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        testContext.setAttribute("driver", driver);
    }



    @AfterMethod
    public void teatDown(){
        driver.quit();
    }

}