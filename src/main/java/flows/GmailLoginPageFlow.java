package flows;

import constants.GmailConstants;
import org.openqa.selenium.WebDriver;
import page.GmailLoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class GmailLoginPageFlow extends BasicFlow {

    private GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);

    public GmailLoginPageFlow(WebDriver driver) {
        super(driver);
    }

    //ACTIONS
    public void goToMainPage () {
        driver.navigate().to(GmailConstants.getMAIN_PAGE_URL());
    }

    public void enterTextInEmailField (String email) {
        gmailLoginPage.getEmailField().click();
        gmailLoginPage.getEmailField().sendKeys(email);
    }

    public void clickNextButton () {
        gmailLoginPage.getNextButton().click();
    }

    public void enterTextInPasswordField (String password) {

        gmailLoginPage.getPasswordField().click();
        gmailLoginPage.getPasswordField().sendKeys(password);
    }

    //ASSERTIONS
    public void assertThatPageIsMyAccountPage () {
        assertThat(getCurrentUrl()).isEqualTo(GmailConstants.getMYACCOUNT_PAGE_URL());
    }
}
