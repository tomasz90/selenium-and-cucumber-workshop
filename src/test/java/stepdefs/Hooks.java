package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lombok.extern.log4j.Log4j;
import utilities.ScreenshotTaker;

import java.io.IOException;

@Log4j
public class Hooks {

    @Before
    //this is performed before every test
    public static void before() {
    }

    @After
    //this is performed after every test
    public void tearDown(Scenario scenario) throws IOException {
        ScreenshotTaker.takeIfFailed(scenario);
    }
}
