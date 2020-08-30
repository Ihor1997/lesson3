package main.java.homework_4;

import main.java.Pages.AuthModal;
import main.java.Pages.HomePage;
import main.java.Pages.RegisterModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class Negative_2  {


    WebDriver driver;
    AuthModal authModal;
    HomePage homePage;
    RegisterModal registerModal;




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
//    public void wayToWarnings()  {
//      //  homePage.open()
//                .callAuthModal();
//        authModal
//                .authModalCross();
//        registerModal.ClickAllRows();
//        checkNullWarnings();
//    }
//    public void checkNullWarnings(){
//        driver.findElement(registerModal.surname).sendKeys("Тестер");
//        driver.findElement(registerModal.name).sendKeys("Игорь");
//        try {
//            driver.findElement(By.xpath("//p[contains(.,'Введите свою фамилию на кириллице')]"));
//        } catch (Exception e){
//
//        } try {
//            driver.findElement(By.xpath("//p[contains(.,'Введите свое имя на кириллице')]"));
//
//        }catch (Exception a){
//            emailErr();
//        }
//    }
//
//
//
//    public void emailErr(){
//
//        String expectedErrEmail = driver
//                .findElement(By.xpath("//p[contains(.,'Введите свою эл. почту или телефон')]")).getText();
//        String actualErrEmail = "Введите свою эл. почту или телефон";
//        assertEquals(expectedErrEmail, actualErrEmail);
//        passwordErr();
//
//    }
//
//
//    public void passwordErr(){
//        WebElement expectedErrPassword = driver
//                .findElement(By.cssSelector("fieldset[class = 'form__row js-new_password validation_type_error']"));
//
//    }



    @AfterMethod
    public void exit(){
        driver.quit();
    }








}