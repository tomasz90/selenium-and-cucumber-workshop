package pageobjects;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;

@Log4j 
public abstract class TestBase extends PageFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = DriverManager.getChromeDriver();
            setDriverOptions(driver);
        }
        return driver;
    }

    static WebDriverWait getWait(int timeOutInSec) {
        return new WebDriverWait(driver, timeOutInSec);
    }

    private static void setDriverOptions(WebDriver driver) {
        driver.manage().window().maximize();
    }

    static boolean isPresent(By by) {
        try {
            new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoaded() {
        return false;
    }
}
