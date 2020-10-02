package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends  BasePage{

    WebDriver driver;

    By goodsPresent = By.cssSelector("[class = 'goods-tile__inner']");
    By elValue = By.cssSelector("span[class = 'goods-tile__title']");

    public SearchResultPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Override
    public BasePage open(String url) {
        return null;
    }

    public SearchResultPage searchDevicePageEndDownload (){
        this.logger.info("Result Page rendering");
        this.logger.debug("----");
        wait.until(ExpectedConditions.elementToBeClickable(goodsPresent));
        return this;
    }









}
