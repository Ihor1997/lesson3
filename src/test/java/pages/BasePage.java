package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriverWait wait;
   // Logger logger = LogManager.getLogger(this.getClass().getName());


    public BasePage(WebDriver driver){
        wait = new WebDriverWait(driver, 10, 500);
    }

    public abstract test.java.pages.BasePage open();


}
