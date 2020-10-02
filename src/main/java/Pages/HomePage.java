package main.java.Pages;

import io.qameta.allure.Step;
import main.java.utils.PropertyLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    WebDriver driver;

    By authBtn = By.cssSelector("a[class = 'header-topline__user-link link-dashed']");
    By search = By.cssSelector("input[name = 'search']");
    By searchBtn = By.xpath("//form/button");
    By cardElements = By.cssSelector("ul[class = 'menu-categories menu-categories_type_main']");




    public  HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("Home page open")
    public HomePage open(String url){
        this.logger.trace("Test");
        this.logger.info("Home page was opened");
        this.logger.debug("----");
        driver.get(PropertyLoader.loadProperty(url));
        return this;
    }

    public HomePage endPageRendering(){
        this.logger.info("Home page Rendering");
        wait.until(ExpectedConditions.elementToBeClickable(cardElements));
        return this;
    }

    public HomePage callAuthModal(){
        wait.until(ExpectedConditions.elementToBeClickable(authBtn)).click();
        return this;
    }

    public HomePage searchDevice(String searchValue){
        this.logger.info("Search Device");
        wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys(searchValue);
        driver.findElement(searchBtn).click();
        return this;
    }


    public HomePage clickFilter(String providerValue){
        this.logger.info("Find Checkbox with Provider value");
        driver.findElement(By.xpath("//label[contains(.,'"+providerValue+"')]")).click();
        return this;
    }



}
