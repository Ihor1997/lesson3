package main.java.homework_6;

import main.java.Pages.HomePage;
import main.java.Pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task_1 extends Properties{

    HomePage homePage;
    SearchResultPage searchResultPage;
    By laptopBntMainMenu = By.xpath("//a[contains(.,'Ноутбуки и компьютеры')]");
    By laptopBtnSecondMenu = By.xpath("//img[@alt='Ноутбуки']");
    By checkBox = By.xpath("//label[contains(.,'Acer')]");
    By elValue = By.cssSelector("span[class = 'goods-tile__title']");

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test(dataProvider = "dp")
    public void runToDevice(String resultName, String Device ) throws InterruptedException {
        homePage.open("https://rozetka.com.ua/notebooks/c80004/");
        searchResultPage.searchDevicePageEndDownload();
        driver.findElement(checkBox).click();
        searchResultPage.searchDevicePageEndDownload();

        List<WebElement> getElText = driver.findElements(elValue);

        for (WebElement webElement: getElText) {
            String name = webElement.getText();
            resultName = name.toUpperCase();

            if (resultName.contains("ACER")){
                System.out.println();

                continue;
            } else {
                System.out.println("Error");
            }


        }





        Thread.sleep(1000);











    }

    @DataProvider(name = "dp")
    public Object[][] provider(String Device) {
        return new Object[][] {
                {"Acer" }, {"Apple" }, {"Asus" }, {"Dell" }, {"Dream Machines" }, {"HP" }, {"Huawei" }, {"Lenovo" }, {"MSI" }, {"Microsoft" }, {"Razer" }, {"Xiaomi" }, {"Alien" }, {"Chuwi" }, {"Compaq" }, {"Digma" }, {"Durabook" }, {"Epic" }, {"Fujitsu" }, {"Fujitsu-siemens" }, {"Gigabyte" }, {"Google" }, {"Jumper" }, {"Mediacom" }, {"Medion" }, {"Mixzo" }, {"NuVision" }, {"Odys" }, {"Panasonic" }, {"Porsche Design" }, {"Prestigio" }, {"RCA" }, {"Teclast" }, {"Toshiba" }, {"Vinga" }, {"Yepo" }

        };
    }


}
