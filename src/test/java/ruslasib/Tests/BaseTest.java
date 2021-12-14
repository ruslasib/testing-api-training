package ruslasib.Tests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification defaultRequest;
    protected ResponseSpecification defaultResponse;

    @BeforeClass
    public void setUp(){
        defaultRequest = new RequestSpecBuilder().build();
        defaultRequest.
                contentType(ApplicationConstants.CONTENT_TYPE).
                header(ApplicationConstants.AUTHORIZATION).
                log().
                all();

        defaultResponse = new ResponseSpecBuilder().build();
        defaultResponse.expect().statusCode(201);
    }
}
