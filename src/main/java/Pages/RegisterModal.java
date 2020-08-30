package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterModal {

    WebDriver driver;
    WebDriverWait wait;
    public By surname = By.cssSelector("input[formcontrolname = 'surname']");
    public By name = By.xpath("//fieldset[2]/input");
    By email = By.xpath("//fieldset[3]/input");
    By password = By.xpath("//fieldset[4]/div/input");
    By submit = By.xpath("//button[@type='submit']");



    public   RegisterModal(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }


    public   RegisterModal ClickAllRows(){
        wait.until(ExpectedConditions.elementToBeClickable(surname)).click();
        driver.findElement(name).click();
        driver.findElement(email).click();
        driver.findElement(password).click();
        driver.findElement(submit).click();
        return this;

    }




}
