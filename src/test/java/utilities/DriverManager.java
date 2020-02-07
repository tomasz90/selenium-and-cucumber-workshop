package utilities;

import constants.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver getChromeDriver() {
        System.setProperty(DriverConfig.CHROME_DRIVER_KEY, DriverConfig.CHROME_DRIVER_PATH + getChromeDriverFileByOS());
        return new ChromeDriver();
    }

    private static String getChromeDriverFileByOS() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            return DriverConfig.DRIVER_WINDOWS;
        }
        if (os.contains("mac")) {
            return DriverConfig.DRIVER_MAC;
        } else {
            return DriverConfig.DRIVER_LINUX;
        }
    }
}
