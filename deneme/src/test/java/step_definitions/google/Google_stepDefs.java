package step_definitions.google;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.google.GoogleSearch_Page;
import utilities.Driver;

public class Google_stepDefs {

    GoogleSearch_Page googleSearch_page = new GoogleSearch_Page();


    @Given("User is on google webpage")
    public void user_is_on_google_webpage() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User searches {string}")
    public void user_searches(String string) {
        googleSearch_page.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string}")
    public void user_should_see(String expectedTitle) {
        Assert.assertEquals("Title is not matching", Driver.getDriver().getTitle(), expectedTitle);
    }


}
