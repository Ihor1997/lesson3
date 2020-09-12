package main.java.homework_7;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import main.java.Pages.HomePage;
import main.java.Pages.SearchResultPage;
import main.java.homework_6.Properties;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

@Epic("Random Manufacture")
@Feature("Checkbox Work")

public class Task_1 extends Properties {

        HomePage homePage;
        SearchResultPage searchResultPage;
        String[] manufacture = {"Acer", "Apple"};
        int randomValue = (int)(Math.random() * manufacture.length);




        @BeforeMethod
        public void pageFactory(){
            homePage = new HomePage(driver);
            searchResultPage = new SearchResultPage(driver);
        }

        @Description("Random checkbox iteration")
        @Test
        public void randomManufacturer(){
            homePage.open();
            searchResultPage.searchDevicePageEndDownload();
            homePage.clickFilter(manufacture[randomValue]);
            searchResultPage.searchDevicePageEndDownload();

            List<WebElement> getElText = driver.findElements(elValue);

            for (WebElement webElement : getElText) {
                String name = webElement.getText();
                String resultCheckboxValue = Integer.toString(randomValue);

                assertTrue(name.contains(resultCheckboxValue));
            }





        }
}
