package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.GoogleMain_Page;
import utilities.Driver;

public class Google_StepDefs {

    GoogleMain_Page googleMain_page = new GoogleMain_Page();



    @When("User is on google main page")
    public void user_is_on_google_main_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User should be able to put {string}")
    public void user_should_be_able_to_put(String searchValuse) {
        googleMain_page.searchBox.sendKeys(searchValuse);
    }

    @When("User should be able to click search button")
    public void user_should_be_able_to_click_search_button() {
        googleMain_page.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("User should be able to see the result realted to search keyword")
    public void user_should_be_able_to_see_the_result_realted_to_search_keyword() {
        System.out.println(Driver.getDriver().getTitle());
    }
}
