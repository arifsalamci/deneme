
Feature: Expenses
  Agile Story: As a user I should be able to create expenses so that I can submit to Manager
  @smoke
  Scenario: Creating expense as an Officer positive

    Given User clicks on the Expenses functionality
    When User clicks on the Create button
    When user fills out the expense description
    And User clicks on the product dropdown
    And User clicks on the unit price module
    And User clicks on the quantity module
    And User clicks on the Employee dropdown
    And User clicks on the Notes box
    And User clicks on the save button
    Then User clicks on the Submit to Manager button


@negative
  Scenario: Creating expense as an Officer negative

    Given User clicks on the Expenses functionality
    When User clicks on the Create button
    And user fills out the expense description
    And User enters unlisted product and adds it
    And User clicks on the unit price module
    And User clicks on the quantity module
    And User clicks on the Employee dropdown
    And User clicks on the Notes box
    And User clicks on the save button
    Then User sees error message




