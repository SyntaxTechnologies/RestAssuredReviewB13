package utils;

import io.restassured.RestAssured;

public class apiConstants {

    public static final String BaseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    public static final String GENERATE_TOKEN_URI = "/generateToken.php";
    public static final String CREATE_EMPLOYEE_URI = "/createEmployee.php";
    public static final String GET_ONE_EMPLOYEE_URI = "/getOneEmployee.php";
    public static final String UPDATE_EMPLOYEE_URI = "/updateEmployee.php";
    public static final String GET_ALL_EMPLOYEES_URI = "/getAllEmployees.php";
    public static final String DELETE_EMPLOYEE_URI = "/deleteEmployee.php";

    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_VALUE = "application/json";
    public static final String HEADER_AUTHORIZATION = "Authorization";

}
