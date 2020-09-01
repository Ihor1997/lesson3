package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    WebDriver driver;

    By contactBtnBy = By.cssSelector("[class='header-topline__links'] a[href$='/contacts/']");

    public  HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Override
    public test.java.pages.BasePage open() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }
    public HomePage clickContacts() {
       // logger.info("Click contact page");
        //System.out.println(1/0);
        WebElement contactBtn = driver.findElement(contactBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(contactBtnBy));
        contactBtn.click();
        return this;
    }

}
