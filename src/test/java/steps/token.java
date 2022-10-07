package steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
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

        String tok = response.jsonPath().getString("token");
        token="Bearer "+tok;

    }
}
