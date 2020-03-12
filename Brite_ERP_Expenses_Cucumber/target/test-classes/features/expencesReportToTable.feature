@smoke
Feature:Expenses Module
Agile Story:As a User i should be able to create Expense Report,
so that report will be stored in The Expense to Approve Table


Scenario: Verification create report functionality

  Given User on the landing page of the app
  And User press Expensess Horizontal Sidebar
  And Expenses page open and User Press Expenses Report Sidebar
  And My reports page open and User Press create button
  And Expenses Report frame popup and User fill up all information and press Add an item button
  And Expense Lines page open
  And User select item and press select button
  And User press Save button
  Then confirmation message :Expense report submitted, waiting approval should be displayed

    Scenario: Verification Expense Reports To Aprove

  Given User on the landing page of the app
  And User press Expensess Horizontal Sidebar
  And Expenses page open and User Press Expense Reports to Approve
  And Expenses reports to approve Table should be displayed
  And User choose created report
  Then Created report should open, all information inside the report should match entered information

