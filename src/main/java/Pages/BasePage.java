package main.java.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
     WebDriverWait wait;

    public BasePage(WebDriver driver){
        wait = new WebDriverWait(driver, 10, 500);
    }

    public abstract BasePage open(String url);


}
