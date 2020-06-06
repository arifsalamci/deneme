package step_definitions.yahoo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.yahoo.YahooMails;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Yahoo_stepDefs {
    YahooMails yahooMails = new YahooMails();

    @Given("User is on {string}")
    public void user_is_on(String yahoo) {
        Driver.getDriver().get(yahoo);
        yahooMails.signINButton.click();
        yahooMails.userNameBox.sendKeys("arifsalamci" + Keys.ENTER);
        yahooMails.passwordBox.sendKeys("Busbus19" + Keys.ENTER);
        yahooMails.mailButton.click();
    }

    @When("User go to every email and check them and get emails including {string}")
    public void user_go_to_every_email_and_check_them_and_get_emails_including(String string) {


        System.out.println(yahooMails.listOfSenders.size());
        for (int i = 0; i < yahooMails.listOfSenders.size(); i++) {
            System.out.println(yahooMails.listOfSenders.size());
            yahooMails.listOfSenders.get(i).click();
            yahooMails.backButton.click();
            Driver.getDriver().navigate().refresh();

        }
    }
}
