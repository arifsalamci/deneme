$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/apiFetaures/singleStudent.feature");
formatter.feature({
  "name": "Single Student API Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Single Student Attribute Validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SingleStudent"
    }
  ]
});
formatter.step({
  "name": "User hits the single student API \"http://api.cybertektraining.com/student/6737\"",
  "keyword": "When "
});
formatter.match({
  "location": "api_stepDefs.user_hits_the_single_student_API(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks for required atributes",
  "keyword": "Then "
});
formatter.match({
  "location": "api_stepDefs.user_checks_for_required_atributes()"
});
formatter.result({
  "status": "passed"
});
});