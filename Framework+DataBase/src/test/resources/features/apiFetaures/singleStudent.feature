Feature: Single Student API Automation
@SingleStudent
  Scenario: Single Student Attribute Validation

    When User hits the single student API "http://api.cybertektraining.com/student/6737"
    Then User checks for required atributes