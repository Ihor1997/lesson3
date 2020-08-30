package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class  AuthModal {

    WebDriver driver;
    WebDriverWait wait;
    By registerButton = By.className("auth-modal__register-link");

     public AuthModal (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);

    }


     public   AuthModal authModalCross(){
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();


        return this;
    }


}
