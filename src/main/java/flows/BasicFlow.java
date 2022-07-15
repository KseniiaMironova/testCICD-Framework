package flows;

import org.openqa.selenium.WebDriver;

public class BasicFlow {

    protected WebDriver driver;

    public BasicFlow(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
