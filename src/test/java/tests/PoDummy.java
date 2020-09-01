package test.java.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;
import test.java.pages.QaPage;

public class PoDummy extends  TestBaseSetUp {

    String expectedFontColor = "rgba(62, 119, 170, 1)";

    HomePage homePage;
    ContactPage contactPage;
    QaPage qaPage;

    @BeforeMethod
    public void setFactory() {

        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        qaPage = new QaPage(driver);
    }

    @Test
    public void test1() {
        homePage
                .open();
        homePage.clickContacts();
//        contactPage.clickQa();
//        List<WebElement> questions = qaPage.getQuestion();
//        for (WebElement question : questions) {
//            String actualFontColor = question.getCssValue("color");
//            assertEquals(
//                    actualFontColor,
//                    expectedFontColor,
//                    String.format("Expected blue color for questuion '%s'", question.getText())
//            );
//        }
//    }
//
//
//    public Object[][] dp() {
//        return new Object[][]{
//                {"Acer" }, {"Apple" }, {"Asus" }, {"Dell" }, {"Dream Machines" }, {"HP" }, {"Huawei" }, {"Lenovo" }, {"MSI" }, {"Microsoft" }, {"Razer" }, {"Xiaomi" }, {"Alien" }, {"Chuwi" }, {"Compaq" }, {"Digma" }, {"Durabook" }, {"Epic" }, {"Fujitsu" }, {"Fujitsu-siemens" }, {"Gigabyte" }, {"Google" }, {"Jumper" }, {"Mediacom" }, {"Medion" }, {"Mixzo" }, {"NuVision" }, {"Odys" }, {"Panasonic" }, {"Porsche Design" }, {"Prestigio" }, {"RCA" }, {"Teclast" }, {"Toshiba" }, {"Vinga" }, {"Yepo" }
//        };
//    }

    } }

