package test.java.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;

public class DummyTest2 extends TestBaseSetUp {


    HomePage homePage;
    ContactPage contactPage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);

    }

    @Test
    public void test1(){
        homePage.open();
    }

    @Test
    public void test2(){
        contactPage.open();
    }




}
