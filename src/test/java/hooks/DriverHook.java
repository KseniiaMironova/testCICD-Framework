package hooks;

import io.cucumber.java.Before;
import org.testng.annotations.AfterSuite;
import webdriver.WebDriverSingleton;

public class DriverHook {

    @Before
    public void setDriver () {
        System.setProperty("browser", "chrome");
        WebDriverSingleton.getDriver();
    }

    @AfterSuite
    public void closeDriver() {
        WebDriverSingleton.closeDriver();
    }
}
