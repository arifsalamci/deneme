package step_definitions;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.TempStorage;

public class Hooks {


    @Before
    public void setUp() {

        TempStorage.clear();
    }


    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed() && Driver.getDriverReference() != null ) {

            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image.png");
        }
        Driver.quitDriver();
    }
}
