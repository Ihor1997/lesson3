package main.java.homework_4.homework_4_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    By authBtn = By.cssSelector("a[class = 'header-topline__user-link link-dashed']");
    By search = By.cssSelector("input[name = 'search']");
    By searchBtn = By.xpath("//form/button");



    public  HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    public HomePage open(){
        driver.get("https://rozetka.com.ua/");
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
