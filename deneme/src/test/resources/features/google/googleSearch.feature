@google
Feature: Google search fuctionality

  Background:
    Given User is on google webpage

  Scenario Outline: Title verification

    When User searches "<searchKeyword>"
    Then User should see "<ExpectedTitle>"

    Examples:

      | searchKeyword | ExpectedTitle               |
      | Galatasaray   | Galatasaray - Google Search |
      | Haberturk     | Haberturk - Google Search   |
