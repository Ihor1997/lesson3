package main.java.homework_6;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Properties {

    WebDriver driver;

//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
//    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
