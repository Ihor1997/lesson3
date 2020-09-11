package main.java.homework_5;

import main.java.Pages.HomePage;
import main.java.Pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task_1 {

    WebDriver driver;
    HomePage homePage;
    SearchResultPage searchResultPage;
    By elValue = By.cssSelector("span[class = 'goods-tile__title']");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver,", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);

    }

    @Test()
    public void searchIphonePage() {
        homePage.open()
                .searchDevice("Iphone");
        searchResultPage
                .searchDevicePageEndDownload();

        List<WebElement> getElText = driver.findElements(elValue);

        for (WebElement webElement: getElText) {
            String name = webElement.getText();

            if (name.contains("Apple iPhone")){
                continue;
            } else {
                System.out.println("Error");
            }


        }




    }

    @AfterMethod
    public void exit(){
        driver.quit();
    }

}