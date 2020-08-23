package main.java.homework_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Negative_1 {

    WebDriver driver;
    WebDriverWait wait;

    By waitForAuth = By.cssSelector("a[class = 'header-topline__user-link link-dashed']");
    By registerButton = By.className("auth-modal__register-link");
    By surname = By.cssSelector(".form__row:nth-child(1) > .ng-untouched");
    By name = By.xpath("//fieldset[2]/input");
    By email = By.xpath("//fieldset[3]/input");
    By password = By.xpath("//fieldset[4]/div/input");
    By submit = By.xpath("//button[@type='submit']");



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver,", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10, 500);

    }

    @Test()
    public void runWayToWarnings() {
        driver.get("https://rozetka.com.ua/");
        wait.until(ExpectedConditions.elementToBeClickable(waitForAuth)).click();
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(surname)).click();
        driver.findElement(name).click();
        driver.findElement(email).click();
        driver.findElement(password).click();
        driver.findElement(submit).click();
        surnameErr();
    }

    public void surnameErr() {

        String expectedErrSurName = driver
                .findElement(By.xpath("//p[contains(.,'Введите свою фамилию на кириллице')]")).getText();
        String actualErrSurName = "Введите свою фамилию на кириллице";
        assertEquals(expectedErrSurName, actualErrSurName);
        nameErr();

    }

    public void nameErr() {
        String expectedErrName = driver
                .findElement(By.xpath("//p[contains(.,'Введите свое имя на кириллице')]")).getText();
        String actualErrName = "Введите свое имя на кириллице";
        assertEquals(expectedErrName, actualErrName);
        emailErr();

    }

    public void emailErr(){
        String expectedErrEmail = driver
                .findElement(By.xpath("//p[contains(.,'Введите свою эл. почту или телефон')]")).getText();
        String actualErrEmail = "Введите свою эл. почту или телефон";
        assertEquals(expectedErrEmail, actualErrEmail);
        passwordErr();
    }


    public void passwordErr(){
        WebElement expectedErrPassword = driver
                .findElement(By.cssSelector("fieldset[class = 'form__row js-new_password validation_type_error']"));
    }



    @AfterMethod
    public void exit(){
        driver.quit();
    }



}
