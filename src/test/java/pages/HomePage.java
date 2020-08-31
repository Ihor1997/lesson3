package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By contactBtnBy = By.cssSelector("[class='header-topline__links'] a[href$='/contacts/']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    public HomePage open() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public HomePage clickContacts() {
        WebElement contactBtn = driver.findElement(contactBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(contactBtnBy));
        contactBtn.click();
        return this;
    }


}
