package main.java.homework_4;

import main.java.Pages.AuthModal;
import main.java.Pages.HomePage;
import main.java.Pages.RegisterModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class Negative_1 {

    WebDriver driver;
    AuthModal authModal;
    HomePage homePage;
    RegisterModal registerModal;
    By passwordErr = By.cssSelector("fieldset[class = 'form__row js-new_password validation_type_error']");



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver,", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        authModal = new AuthModal(driver);
        homePage = new HomePage(driver);
        registerModal = new RegisterModal(driver);

    }

//    @Test()
//    public void runWayToWarnings() {
//        homePage.open()
//                .callAuthModal();
//        authModal
//                .authModalCross();
//        registerModal.ClickAllRows();
//        checkAllRowsErr();
//
//    }
//
//        public void checkAllRowsErr(){
//            List<WebElement> errorElementsSize = driver.findElements(By.cssSelector("p[class = validation-message"));
//            if (errorElementsSize.size() == 3){
//                driver.findElement(passwordErr);
//            }
//
//        }
//


    @AfterMethod
    public void exit(){
        driver.quit();
    }



}
