package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.APIRunner;
import utilities.CustomResponse;

import java.sql.DriverManager;

public class api_stepDefs {


    @When("User hits the single student API {string}")
    public void user_hits_the_single_student_API(String string) {
    APIRunner.runGet(string);

    }

    @Then("User checks for required atributes")
    public void user_checks_for_required_atributes() {

        System.out.println(APIRunner.getResponse().getStudents().get(0).getFirstName());
        System.out.println(APIRunner.getResponse().getStudents().get(0).getLastName());
        System.out.println(APIRunner.getResponse().getStudents().get(0).getContact().getEmailAddress());
        System.out.println(APIRunner.getResponse().getStudents().get(0).getCompany().getCompanyName());
        System.out.println(APIRunner.getResponse().getStudents().get(0).getCompany().getAddress().getCity());
    }

}
