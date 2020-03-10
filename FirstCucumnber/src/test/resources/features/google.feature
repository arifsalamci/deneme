Feature:Google feature verifications

  Scenario Outline: Verification of Google search functionality

    When User is on login page
    And User puts credentials in "<username>" and "<password>" box
    And User clicks on login button
    Then It should navigate user to landing page
#    Given User is on landing page
#    When User clicks Expenses module at the top
#    Then It should navigate to Expenses page
#    Given User is on Expenses page
#    When Click on Expense Reports to Approve at the left side
#    Then It should navigate to Expense Reports to Approve page
#    Given User is on Expense Reports to Approve page
#    When Verify that there is a filter called To Approved
#    Then User should verify that there is a filter called To Approved
#    Given User is on Expense Reports to Approve page
#    When User cancels the filter To Approved option
#    Then User should be able to cancel the filter
#    Given User is on Expense Reports to Approve page
#    When User  verifies that all list of any kind of expenses should be displayed
#    Then User should be able to cancel the filter
#    Given User is on Expense Reports to Approve page
#    When User clicks on one of the submitted expenses displayed in the list
#    Then It should navigate to page of that expenses
#    Given User is on Expense Reports to Approve page
#    When User verifies there is a Refuse button right next to Approve button
#    Then Refuse button should be displayed
#    Given User is on Expense Reports to Approve page
#    When User clicks Refuse button
#    Then Refuse Expense pop-up window should be opened
#    Given User is on Expense Reports to Approve page
#    When User verifies that there is a place to write the reason of refusing
#    Then User should be able to see the place to write the reason of refusing
#    Given User is on Refuse pop-up window.
#    When User writes the reason of refusing
#    Then User should be able to write the reason of refusing
#    Then User clicks Refuse button
#    Then User should be able to click refuse button and pop-up window should be closed
#    Given User is on Refuse pop-up window.
#    When User clicks on Expense Reports to Approve again
#    Then  It should navigate to page of list of all expenses
#    Given User is on the page of list of all expenses
#    When Refused expense should be shown as refused int the list
#    Then  User verifies that refused one is shown as refused

    Examples:

    username | password |
    kjdhfsjdhfkjs|sakjbcdskjbc|