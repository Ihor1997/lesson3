package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    WebDriver driver;

    By authBtn = By.cssSelector("a[class = 'header-topline__user-link link-dashed']");
    By search = By.cssSelector("input[name = 'search']");
    By searchBtn = By.xpath("//form/button");



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

    public HomePage searchIphone(){
        wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys("Iphone");

        driver.findElement(searchBtn).click();
        return this;
    }

    public HomePage searchSamsung(){
        wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys("Samsung");
        driver.findElement(searchBtn).click();
        return this;

    }



}
