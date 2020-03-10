package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import pages.Expense_Reports_To_Approve_Page;
import pages.Expenses_Main_Page;
import pages.Login_Page;
import utilities.Config;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Expense_Report_To_Aprrove_Refuse_StepDefs {

        Expense_Reports_To_Approve_Page expense_reports_to_approve_page = new Expense_Reports_To_Approve_Page();
        Login_Page login_page = new Login_Page();
        Expenses_Main_Page expenses_main_page = new Expenses_Main_Page();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("http://app.briteerp.com/web?#view_type=list&model=hr.expense&action=540");

        login_page.loginButton.click();
    }

    @When("User puts credentials in {string} and {string} box")
    public void user_puts_credentials_in_and_box(String email, String password) {
        login_page.emailInput.sendKeys(Config.getProperty("email"));
        login_page.passwordInput.sendKeys(Config.getProperty("password"));
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
      login_page.loginButton.click();
    }

    @Then("It should navigate user to landing page")
    public void it_should_navigate_user_to_landing_page() throws InterruptedException {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Thread.sleep(2000);
        System.out.println(actualTitle);

        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }



    @When("User clicks Expenses module at the top")
    public void user_clicks_Expenses_module_at_the_top() {
        login_page.expenseModule.click();
    }

    @Then("It should navigate to Expenses page")
    public void it_should_navigate_to_Expenses_page() {
        String actualTitle = Driver.getDriver().getTitle();

        String expectedTitle = "My Expenses to Submit - Odoo";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }



    @When("Click on Expense Reports to Approve at the left side")
    public void click_on_Expense_Reports_to_Approve_at_the_left_side() {
        expenses_main_page.expenseReportsToApprove.click();
    }

    @Then("It should navigate to Expense Reports to Approve page")
    public void it_should_navigate_to_Expense_Reports_to_Approve_page() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "My Expenses to Submit - Odoo";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }


    @When("Verify that there is a filter called To Approved")
    public void verify_that_there_is_a_filter_called_To_Approved() throws InterruptedException {
        Thread.sleep(2000);
      Assert.assertTrue(expense_reports_to_approve_page.approvedFilterClose.isDisplayed());
    }

    @Then("User should verify that there is a filter called To Approved")
    public void user_should_verify_that_there_is_a_filter_called_To_Approved() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(expense_reports_to_approve_page.approvedFilterClose.isDisplayed());
    }

    @When("User cancels the filter To Approved option")
    public void user_cancels_the_filter_To_Approved_option() throws InterruptedException{
        expense_reports_to_approve_page.approvedFilterClose.click();
        Thread.sleep(2000);
    }

    @Then("User should be able to cancel the filter")
    public void user_should_be_able_to_cancel_the_filter() {


        List<String> list = new ArrayList<>();
        for (WebElement element: expense_reports_to_approve_page.listOfElements) {
            list.add(element.getText());
        }

        Assert.assertTrue(list.contains("Submitted"));
        Assert.assertTrue(list.contains("Approved"));
        Assert.assertTrue(list.contains("Refused"));
    }

    @When("User  verifies that all list of any kind of expenses should be displayed")
    public void user_verifies_that_all_list_of_any_kind_of_expenses_should_be_displayed() {

        List<String> list = new ArrayList<>();

        for (WebElement element: expense_reports_to_approve_page.listOfElements) {
           list.add(element.getText());
        }

       Assert.assertTrue(list.contains("Submitted"));
        Assert.assertTrue(list.contains("Approved"));
        Assert.assertTrue(list.contains("Refused"));
    }

    @When("User clicks on one of the submitted expenses displayed in the list")
    public void user_clicks_on_one_of_the_submitted_expenses_displayed_in_the_list() {
        expense_reports_to_approve_page.submittedExpense.click();
}

    @Then("It should navigate to page of that expenses")
    public void it_should_navigate_to_page_of_that_expenses() throws InterruptedException {

        String expense = "[@#$%^&8] person";
        Thread.sleep(2000);

        Assert.assertTrue(expense.equals(expense));
    }

    @When("User verifies there is a Refuse button right next to Approve button")
    public void user_verifies_there_is_a_Refuse_button_right_next_to_Approve_button() {
      Assert.assertTrue(expense_reports_to_approve_page.refuseButton.isDisplayed());
    }

    @Then("Refuse button should be displayed")
    public void refuse_button_should_be_displayed() {
        expense_reports_to_approve_page.refuseButton.click();
    }


    @When("User clicks Refuse button next to Approve button")
    public void userClicksRefuseButtonNextToApproveButton() {
        expense_reports_to_approve_page.refuseButton.click();
    }



    @When("User writes the reason of refusing")
    public void user_writes_the_reason_of_refusing() throws InterruptedException {
        Thread.sleep(2000);
        expense_reports_to_approve_page.refuseInputBox.click();
        expense_reports_to_approve_page.refuseInputBox.sendKeys("Not neccessary");
    }



    @Then("User clicks Refuse button in window")
    public void user_clicks_Refuse_button_in_window() {
        expense_reports_to_approve_page.refuseInWindow.click();
    }


    @When("User clicks on Expense Reports to Approve again")
    public void user_clicks_on_Expense_Reports_to_Approve_again() throws InterruptedException {
        Thread.sleep(2000);
        expense_reports_to_approve_page.expense_Report_To_Approve.click();
    }

    @Then("It should navigate to page of list of all expenses")
    public void it_should_navigate_to_page_of_list_of_all_expenses() {
        expense_reports_to_approve_page.headerOfExpenseReportToApprove.isDisplayed();
    }


    @When("Refused expense should be shown as refused int the list")
    public void refused_expense_should_be_shown_as_refused_int_the_list() {
        Assert.assertTrue(expense_reports_to_approve_page.refusedExpenseInList.isDisplayed());
    }




}
