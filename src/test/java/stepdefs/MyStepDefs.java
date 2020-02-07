package stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;

import static pageobjects.TestBase.getDriver;

public class MyStepDefs {

    HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
    
    // TODO: 12/16/2019 Implement steps from feature file :)
    @Given("I am on google page") public void iAmOnGooglePage() {
    }
}
