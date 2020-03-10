@Google
Feature: Google search verifications


  Background:

    Given User is on the google main page

  Scenario: Google search functionalty verifications


    When User types "wooden spoon" keyword
    And User press enter
    Then User should see the "wooden spoon - Google Search"


  Scenario: Google search functionalty verifications2


    When User types "Galatasaray" keyword
    And User press enter
    Then User should see the "Galatasaray - Google Search"