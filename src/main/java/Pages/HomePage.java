package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    WebDriver driver;

    By authBtn = By.cssSelector("a[class = 'header-topline__user-link link-dashed']");
    By search = By.cssSelector("input[name = 'search']");
    By searchBtn = By.xpath("//form/button");
    By checkbox = By.xpath("//label[contains(.,'Acer')]");



    public  HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public HomePage open(String url){
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        return this;
    }

    public HomePage callAuthModal(){
        wait.until(ExpectedConditions.elementToBeClickable(authBtn)).click();
        return this;
    }

    public HomePage searchDevice(String searchValue){
        wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys(searchValue);
        driver.findElement(searchBtn).click();
        return this;
    }

    public HomePage checkboxVale(String ){

    }





    public HomePage clickFilter(){
    driver.findElement().click();
        return this;
    }



}
