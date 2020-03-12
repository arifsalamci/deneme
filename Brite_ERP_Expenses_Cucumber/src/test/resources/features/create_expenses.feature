@smoke
Feature: Expenses module
  Agile story: When user in expenses module, user should be able to
  create expenses, save and submit to manager.
Scenario: User Login verification
Given User entered correct credentials and logs in
#And user clicks expenses module
#Then My Expense to submit page is displayed
Scenario:Create button verification
When user press create button
Then Expenses to submit frame popup

Scenario: Fill all the information
When User chooses product in the product dropdown
And user chooses employee from employee dropdown
Then User verifies product input displayed in the expense description field

Scenario: Verify saved expense
When user presses Save button
Then confirmation message "Expense created" should be displayed
And submit to manager button should be displayed

Scenario: submit to manager button verification
When user clicks submit_to_manager button
Then user should see approve and refuse button

Scenario: submitted message verification
When user clicks save button
Then user should see "Expense report submitted, waiting approval" message
#
#@test
##  Scenario Outline: Fill all the information
#  Scenario Outline: User Login verification
#    Given User entered correct credentials and logs in
#    When user press create button
#    Then Expenses to submit frame popup
#    And User fills up "<expense description>" information
#    And User chooses "<product>" in the product dropdown
##    And user chooses "<employee>" from employee dropdown
#Examples:
#  |expense description|product        |employee        |
#  |lunch with team    |[253] Tshirt   |Ashley Presley  |
##  |transportation     |[///] iphone 8 |David Samson    |
##  |lunch with customer|pizza          |Antonie Langlais|