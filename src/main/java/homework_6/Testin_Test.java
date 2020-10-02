package main.java.homework_6;


import main.java.Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Testin_Test extends Properties{

    String rgbCardColorSelector = "ul[class = 'menu-categories menu-categories_type_main']";
    String phoneCss = "a.main-support__phone";
    String actualRgbColor = "rgba(51, 51, 51, 1)";
    HomePage homePage;

    @BeforeMethod
    public void pageFactory(){
        homePage = new HomePage(driver);
    }

    @Test
    public void checkRgbCard(){
    homePage.open("HomePage.Url")
            .endPageRendering();
//    List<WebElement> elements = driver.findElements(By.cssSelector(rgbCardColorSelector));
        List<WebElement> elements = driver.findElements(By.cssSelector(phoneCss));
        System.out.println(elements);

        for (WebElement element: elements) {

            String getActualRgbColor = element.getAttribute("href");
            System.out.println(getActualRgbColor);
//            String actualRgbColor = "rgba(51, 51, 51, 1)";
//            assertEquals(getActualRgbColor, actualRgbColor);

        }



    }


}
