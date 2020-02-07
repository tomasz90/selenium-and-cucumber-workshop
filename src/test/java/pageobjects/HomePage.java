package pageobjects;

public class HomePage extends TestBase {

    // TODO: 2/3/2020 Implement method 
    @Override 
    public boolean isLoaded() {
        return false;
    }

    public void navigate() {
        getDriver().navigate().to("http://google.pl");
    }
}
