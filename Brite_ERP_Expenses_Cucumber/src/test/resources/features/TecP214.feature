Feature: Expenses Module: Testing main functionalities for smoke test

  @login
  Scenario: As a user I should be able to login using authenticated test data
    When User is on BrightERP login page
    And User enters username and password and click the button
    Then User should be logged in and be able to verify "Odoo" text is displayed as a title

  @GoToReport
  Scenario: As a user I should be able to navigate Expenses Report to Approve function
    When User click to Expenses module user should be navigate Expenses module
    When User click to Expenses Report to Approve user should be navigate this page
    Then The title of the current page should contains "Odoo"

   @CheckSubmittedList
  Scenario: As a user I should be able to Approve any submitted entries
     When User click to any submitted entry user shoul be navigate the the entry page
     When user in entry page Approve button should be displayed and should be clicked
     Then Approved button should not be displayed





