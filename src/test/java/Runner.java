import constants.TestConfig;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static pageobjects.TestBase.getDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", 
    glue = "stepdefs", 
    plugin = { "pretty",
               "json:target/cucumber-json/cucumber.json", 
               "junit:target/cucumber-reports/Cucumber.xml", 
               "html:target/cucumber-reports" })
public class Runner {

    @BeforeClass 
    public static void setUp() {
        PropertyConfigurator.configure(TestConfig.LOG4J_PROPERTIES);
    }

    @AfterClass 
    public static void tearDown() {
        getDriver().quit();
    }
}
