package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleMain_Page;
import utilities.Driver;

public class Google_StepDefs {

    GoogleMain_Page googleMain_page = new GoogleMain_Page();

    @Given("User is on the google main page")
    public void user_is_on_the_google_main_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User types {string} keyword")
    public void user_types_keyword(String searcValue) {
      googleMain_page.searchBox.sendKeys(searcValue);
    }

    @When("User press enter")
    public void user_press_enter() {
      googleMain_page.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("User should see the {string}")
    public void user_should_see_the(String checkValue) {
       Assert.assertTrue(Driver.getDriver().getTitle().equals(checkValue));
    }

}
