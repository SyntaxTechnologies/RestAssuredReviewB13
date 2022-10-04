package steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.apiConstants;
import utils.apiPayload;

import static io.restassured.RestAssured.given;

public class token {

    String baseURI=RestAssured.baseURI=apiConstants.BaseURI;
    public static String token;
    @Given("a JWT is generated")
    public void a_jwt_is_generated() {
        RequestSpecification request = given().header(apiConstants.HEADER_CONTENT_TYPE, apiConstants.CONTENT_TYPE_VALUE)
                .body(apiPayload.generateTokenBody());

        Response response = request.when().post(apiConstants.GENERATE_TOKEN_URI);

        response.prettyPrint();

        token=response.jsonPath().getString("token");
        token= "Bearer "+token;
        System.out.println(token);

    }
}
