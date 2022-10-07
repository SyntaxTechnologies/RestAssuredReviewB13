package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.apiConstants;

import static io.restassured.RestAssured.given;

public class apiSteps {


    @Given("a request is prepared for creating an employee")
    public void a_request_is_prepared_for_creating_an_employee() {

    }
    @When("a POST call is made to create an employee")
    public void a_post_call_is_made_to_create_an_employee() {

    }
    @Then("the status code for creating an employee is {int}")
    public void the_status_code_for_creating_an_employee_is(Integer int1) {

    }
    @Then("the employee created contains key {string} and value {string}")
    public void the_employee_created_contains_key_and_value(String string, String string2) {

    }
    @Then("the employee created has {string} value {string}")
    public void the_employee_created_has_value(String string, String string2) {

    }
    @Then("the employee id {string} is stored as global variable")
    public void the_employee_id_is_stored_as_global_variable(String string) {

    }

    public RequestSpecification request;
    public Response response;
//    ---------------get all the job titles-------------------
@Given("a request is sent for getting all the available job titles")
public void a_request_is_sent_for_getting_all_the_available_job_titles() {
        request=given().header(apiConstants.HEADER_CONTENT_TYPE,apiConstants.CONTENT_TYPE_VALUE)
                .header(apiConstants.HEADER_AUTHORIZATION,token.token);

}
    @When("a Get request is sent to get all job titles")
    public void a_get_request_is_sent_to_get_all_job_titles() {
        response=request.when().get(apiConstants.JOB_TITLE_ENDPOINT);

    }
    @Then("print all the job titles on the console")
    public void print_all_the_job_titles_on_the_console() {

    
//        Object job = response.jsonPath().get("Jobs[0].job");
//        System.out.println(job);

    }


}
