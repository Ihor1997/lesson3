package main.java.homework_6;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import main.java.Pages.HomePage;
import main.java.Pages.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

@Epic("Filters Iphone")
@Feature("First feature")
public class Task_1 extends Properties{

    HomePage homePage;
    SearchResultPage searchResultPage;
    String tempProducer = "";

    @BeforeMethod
    public void pageFactory(){
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Description("Filter Iteration")
    @Story("Story-1")
    @Test(dataProvider = "dp", dataProviderClass = DataProviderClass.class)
    public void runToDevice(String producer) {
        tempProducer = producer;
        homePage.open("baseurl");
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



//    @DataProvider(name = "dp")
//    public Object[][] provider() {
//        return new Object[][] {
//                {"Acer" }, {"Apple" }, {"Asus" }, {"Dell" }, {"Dream Machines" }, {"HP" }, {"Huawei" }, {"Lenovo" }, {"MSI" }, {"Microsoft" }, {"Razer" }, {"Xiaomi" }, {"Alien" }, {"Chuwi" }, {"Compaq" }, {"Digma" }, {"Durabook" }, {"Epic" }, {"Fujitsu" }, {"Fujitsu-siemens" }, {"Gigabyte" }, {"Google" }, {"Jumper" }, {"Mediacom" }, {"Medion" }, {"Mixzo" }, {"NuVision" }, {"Odys" }, {"Panasonic" }, {"Porsche Design" }, {"Prestigio" }, {"RCA" }, {"Teclast" }, {"Toshiba" }, {"Vinga" }, {"Yepo" }
//
//        };
//    }


}
