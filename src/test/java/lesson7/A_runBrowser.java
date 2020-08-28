package test.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class A_runBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver,", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        By city = By.cssSelector("a[class = 'header-cities__link link-dashed']");
        By city2 = By.xpath("//a[@class = 'header-cities__link link-dashed']");
        By city3 = By.partialLinkText("Київ");

        Thread.sleep(5000);
//        //String citiValue = driver.findElement(city).getText(); 1 option
//        WebElement citiEl = driver.findElement(city);
//        String cityValue = citiEl.getText();
        String citiValue = driver.findElement(By.cssSelector("a[class = 'header-cities__link link-dashed']")).getText();
        System.out.println(citiValue);

        WebElement producerInput = driver.findElement(By.cssSelector("*[data-filter-name='producer'] input[name='searchline'] "));
        WebElement firstGood = driver.findElement(By.xpath("(//a[@class='goods-tile__picture'])[1]"));
        producerInput.sendKeys("Apple");
        Thread.sleep(1000);
        //producerInput.clear();
       // producerInput.sendKeys(Keys.BACK_SPACE);
          producerInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
          producerInput.sendKeys(Keys.DELETE);

        Actions builder = new Actions(driver);
        builder
                .keyUp(Keys.CONTROL)
                .click(firstGood)
                .keyUp(Keys.CONTROL).build().perform();

        for (String window:driver.getWindowHandles()) {
            driver.switchTo().window(window);

        }


        Thread.sleep(5000);
        driver.quit();
    }
}
