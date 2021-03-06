package test.java.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class Screenshot {
    private final WebDriver driver;
    private final String delimiter = System.getProperty("os.name").toLowerCase().contains("windows") ? "\\" : "/";


    public Screenshot(WebDriver driver){
        this.driver = driver;
    }

    public void makeScreenshot(ITestResult result) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr = screenshot.getScreenshotAs(OutputType.FILE);
        Path currentRelativePath = Paths.get("");
        try {
            FileUtils.copyFile(scr, new File(
                    currentRelativePath.toAbsolutePath().toString()
                            + delimiter + "/screenshots"
                            + delimiter + result.getTestClass().getName().replace(".","/")
                            + delimiter + result.getMethod().getConstructorOrMethod().getName()
                            + new Date().getTime() + ".png"
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
