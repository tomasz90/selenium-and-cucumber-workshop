package pageobjects;

import constants.TestData;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Util;

@Log4j
public class CreateAccountPage extends TestBase {

    @FindBy(id = "customer_firstname") private WebElement firstNameField;

    @FindBy(id = "customer_lastname") private WebElement lastNameField;

    @FindBy(id = "passwd") private WebElement passField;

    @FindBy(id = "address1") private WebElement addressField;

    @FindBy(id = "city") private WebElement cityField;

    @FindBy(id = "id_state") private WebElement stateDDM;

    @FindBy(id = "postcode") private WebElement zipField;

    @FindBy(id = "id_country") private WebElement countryDDM;

    @FindBy(id = "phone_mobile") private WebElement phoneField;

    @FindBy(id = "submitAccount") private WebElement registerField;

    private By creationForm = By.id("account-creation_form");

    @Override public boolean isLoaded() {
        return isPresent(creationForm);
    }

    public void enterFirstName() {
        log.info("Enter first name");
        firstNameField.sendKeys(Util.getRandom(TestData.FIRST_NAME));
    }

    public void enterLastName() {
        log.info("Enter last name");
        lastNameField.sendKeys(Util.getRandom(TestData.LAST_NAME));
    }

    public void enterPassword() {
        log.info("Enter password");
        passField.sendKeys(Util.getRandom(TestData.VALID_PASSWORD));
    }

    public void enterAddress() {
        log.info("Enter address");
        addressField.sendKeys(Util.getRandom(TestData.ADDRESS));
    }

    public void enterCity() {
        log.info("Enter city");
        cityField.sendKeys(Util.getRandom(TestData.CITY));
    }

    public void enterZip() {
        log.info("Enter zip");
        zipField.sendKeys(Util.getRandom(TestData.ZIP));
    }

    public void chooseState() {
        log.info("Choose state");
        stateDDM.sendKeys(Util.getRandom(TestData.STATE));
    }

    public void enterPhone() {
        log.info("Enter phone");
        phoneField.sendKeys(Util.getRandom(TestData.PHONE));
    }

    public void clickRegister() {
        log.info("Click register");
        registerField.click();
    }
}
