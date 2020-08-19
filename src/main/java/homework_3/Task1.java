package main.java.homework_3;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        Thread.sleep(1000);
        String phonenumber = driver.findElement(By.cssSelector("button.header-phones__button")).getText();
        String deleteWhiteSpace = phonenumber.replaceAll("[\\s+()-]", "");
        System.out.println("<<" + deleteWhiteSpace + ">>");
        driver.quit();


    }
}
