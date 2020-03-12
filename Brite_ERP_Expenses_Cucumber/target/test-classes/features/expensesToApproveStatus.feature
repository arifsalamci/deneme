@smoke
Feature: As user I should be able to see all submitted / refused / approved statuses

  Scenario: Verification submitted / approved / refuse expenses

    When User Go to the BRIDE ERP web page
    And User  logged into BRIDE ERP Manager account and on Expenses page
    And   User Click on Expense Reports to Approve

    And Remove to approve filter on the search box

    And Enter Approved on search box

    And Fined the to approved filter on the search box and click on it

    And count and print all approved expenses

    Then User should be able to see how many approved status

    

  Scenario: Verification submitted / approved / refuse expenses

    When User Go to the BRIDE ERP web page
    And User  logged into BRIDE ERP Manager account and on Expenses page
    And   User Click on Expense Reports to Approve

    And Remove to approve filter on the search box

    And Enter Refuse on search box

    And Fined the Refuse filter and click on it

    And  count and print all Refuse expenses

    Then User should be able to see how many Refuse status

  Scenario: Verification submitted / approved / refuse expenses

    When User Go to the BRIDE ERP web page
    And User  logged into BRIDE ERP Manager account and on Expenses page
    And   User Click on Expense Reports to Approve
    And Remove to approve filter on the search box

    And Enter Submitted on search box

    And Fined the Submitted filter and click on it

    And  count and print all Submitted expenses


    Then User should be able to see how many Submitted status