package main.java.homework_6;

import main.java.Pages.HomePage;
import main.java.Pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class Task_1 extends Properties{

    HomePage homePage;
    SearchResultPage searchResultPage;
    By laptopBntMainMenu = By.xpath("//a[contains(.,'Ноутбуки и компьютеры')]");
    By laptopBtnSecondMenu = By.xpath("//img[@alt='Ноутбуки']");
    By elValue = By.cssSelector("span[class = 'goods-tile__title']");
    String tempProducer = "";
    @BeforeMethod
    public void pageFactory(){
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test(dataProvider = "dp")
    public void runToDevice(String producer) {
        tempProducer = producer;
        homePage.open("https://rozetka.com.ua/notebooks/c80004/");
        searchResultPage.searchDevicePageEndDownload();
        String arr[] = {producer};
        for (String prod : arr) {
            homePage.clickFilter(prod);
            searchResultPage.searchDevicePageEndDownload();
        }
            List<WebElement> getElText = driver.findElements(elValue);

            for (WebElement webElement : getElText) {
                String name = webElement.getText();
                assertTrue(name.contains(producer));


            }
        }



    @DataProvider(name = "dp")
    public Object[][] provider() {
        return new Object[][] {
                {"Acer" }, {"Apple" }, {"Asus" }, {"Dell" }, {"Dream Machines" }, {"HP" }, {"Huawei" }, {"Lenovo" }, {"MSI" }, {"Microsoft" }, {"Razer" }, {"Xiaomi" }, {"Alien" }, {"Chuwi" }, {"Compaq" }, {"Digma" }, {"Durabook" }, {"Epic" }, {"Fujitsu" }, {"Fujitsu-siemens" }, {"Gigabyte" }, {"Google" }, {"Jumper" }, {"Mediacom" }, {"Medion" }, {"Mixzo" }, {"NuVision" }, {"Odys" }, {"Panasonic" }, {"Porsche Design" }, {"Prestigio" }, {"RCA" }, {"Teclast" }, {"Toshiba" }, {"Vinga" }, {"Yepo" }

        };
    }


}
