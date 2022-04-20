package ruslasib.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ruslasib.Helper;
import ruslasib.Models.CreateUser.CreateUserRequest;
import ruslasib.Models.CreateUser.CreateUserResponse.CreateUserResponse;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.registerParser;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserTests extends BaseTest {

    private String url;

    @BeforeClass
    public void SetUp(){
        url = ApplicationConstants.BASE_URL + ApplicationConstants.USERS;
    }

    @Test
    public void createUserTest()
    {
        String name = Helper.GenerateName();
        String email = Helper.GenerateEmail();

        CreateUserRequest createUserRequest = new CreateUserRequest(name, "male", email, "active");

        CreateUserResponse response =
                given().
                    spec(defaultRequest).
                    body(createUserRequest).
                expect().
                    spec(defaultResponse).
                when().
                    post(url).
                    as(CreateUserResponse.class);

        assertThat(response.getData().getName(), equalTo(name));
    }
}
