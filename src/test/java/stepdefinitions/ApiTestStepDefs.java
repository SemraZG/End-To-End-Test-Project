package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;


public class ApiTestStepDefs {

    Response response;
    @Given("user sends GET request to {string}")
    public void user_sends_get_request_to(String endPoint) {

     response= given().when().get(endPoint);
     response.prettyPrint();

    }
    @Then("HTTP status code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {

        Assert.assertEquals(200, response.getStatusCode());

    }
}
