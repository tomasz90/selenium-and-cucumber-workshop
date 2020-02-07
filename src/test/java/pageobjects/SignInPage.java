package pageobjects;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j
public class SignInPage extends TestBase {

    @FindBy(id = "email") private WebElement emailField;

    @FindBy(id = "passwd") private WebElement passwordField;

    @FindBy(id = "SubmitLogin") private WebElement submitButton;

    @FindBy(css = "#center_column > .alert.alert-danger li") private WebElement errorMessage;

    @FindBy(id = "SubmitCreate") private WebElement createAccountButton;

    @FindBy(id = "email_create") private WebElement createEmailField;

    @FindBy(css = "#center_column .page-heading") private WebElement authenticationLabel;

    @Override 
    public boolean isLoaded() {
        return authenticationLabel.getText().equals("AUTHENTICATION");
    }

    public void enterEmail(String s) {
        log.info("Enter email: " + s);
        emailField.sendKeys(s);
    }

    public void enterPassword(String s) {
        log.info("Enter password: " + s);
        passwordField.sendKeys(s);
    }

    public void submit() {
        log.info("Click submit");
        submitButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void createAccount() {
        log.info("Create account");
        createAccountButton.click();
    }

    public void enterNewEmail() {
        String email = getRandom() + "@test.pl";
        log.info("Enter new email address: " + email);
        createEmailField.sendKeys(email);
    }

    private double getRandom() {
        int min = 0;
        int max = 100000;
        return (Math.random() * ((max - min) + 1)) + min;
    }
}
