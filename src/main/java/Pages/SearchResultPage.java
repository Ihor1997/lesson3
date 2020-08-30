package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    WebDriver driver;
    WebDriverWait wait;
    By goodsPresent = By.cssSelector("[class = 'goods-tile__inner']");
    By elValue = By.cssSelector("span[class = 'goods-tile__title']");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10, 500);
    }

    public SearchResultPage searchDevicePageEndDownload (){
        wait.until(ExpectedConditions.elementToBeClickable(goodsPresent));
        return this;
    }









}
