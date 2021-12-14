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
                contentType("application/json").
                header("Authorization", "Bearer e739a2ae8d984e9a6f9c35de533e020bfe38263e1f4e8e443c97d8310aa9a9f5").
                log().
                all();

        defaultResponse = new ResponseSpecBuilder().build();
        defaultResponse.expect().statusCode(201);
    }
}
