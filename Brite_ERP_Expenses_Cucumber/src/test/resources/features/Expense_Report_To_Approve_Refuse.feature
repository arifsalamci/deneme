Feature:Expenses Module
  Story:As a User have to be able to go to Expense Reports to Approve functionality and see all the
  Expense Sheet and refuse it.
  @smoke
  Scenario: Login as a manager and try to refuse it

    Given User is on login page
    When User puts credentials in "username" and "password" box
    Then User clicks on login button
    Then It should navigate user to landing page
    When User clicks Expenses module at the top
    Then It should navigate to Expenses page
    When Click on Expense Reports to Approve at the left side
    Then It should navigate to Expense Reports to Approve page
    When Verify that there is a filter called To Approved
    Then User should verify that there is a filter called To Approved
    When User cancels the filter To Approved option
    Then User should be able to cancel the filter
    When User  verifies that all list of any kind of expenses should be displayed
    Then User should be able to cancel the filter
    When User clicks on one of the submitted expenses displayed in the list
    Then It should navigate to page of that expenses
    When User verifies there is a Refuse button right next to Approve button
    Then Refuse button should be displayed
    When User clicks Refuse button next to Approve button
    When User writes the reason of refusing
    Then User clicks Refuse button in window
    When User clicks on Expense Reports to Approve again
    Then  It should navigate to page of list of all expenses
    Then User cancels the filter To Approved option
    Then Refused expense should be shown as refused int the list





