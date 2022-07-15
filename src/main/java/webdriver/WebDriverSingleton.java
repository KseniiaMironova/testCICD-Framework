package webdriver;

import exceptions.NoSuchBrowserTypeExceptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton () {}

    private static void setupDriver() {
        if (driver == null) {
            switch (System.getProperty("browser")) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                default:
                    try {
                        throw new NoSuchBrowserTypeExceptions();
                    } catch (NoSuchBrowserTypeExceptions e) {
                        e.getMessage();
                    }
            }
            driver.manage().window().maximize();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) setupDriver();
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver = null;
    }
}
