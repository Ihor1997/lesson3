package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.utils.PropertyLoader;


public class HomePage extends BasePage {
    WebDriver driver;


    By contactBtnBy = By.cssSelector("[class='header-topline__links'] a[href$='/contacts/']");

    public  HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Override
    public test.java.pages.HomePage open() {
        this.logger.trace("Trace");
        this.logger.debug("Debug");
        this.logger.info("Info");
        this.logger.warn("Warn");
        this.logger.error("Error");
        this.logger.fatal("Fatal");


        this.logger.info("Home page was opened");
        logger.debug("[\n" +
                "{\n" +
                "name: 'Vova'\n" +
                "age: 20\n" +
                "}\n" +
                "]\n");
        driver.get(PropertyLoader.loadProperty(""));
        return this;
    }
    public HomePage clickContacts() {
        logger.info("Click contact page");
        WebElement contactBtn = driver.findElement(contactBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(contactBtnBy));
        contactBtn.click();
        return this;
    }

}
