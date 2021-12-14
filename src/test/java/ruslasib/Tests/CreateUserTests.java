package ruslasib.Tests;

import com.github.javafaker.Faker;
import org.testng.annotations.*;
import ruslasib.Models.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateUserTests extends BaseTest {

    @Test
    public void createUserTest()
    {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String email = name + ".rus@mailinatior.com";
        CreateUserRequest createUserRequest = new CreateUserRequest(name, "male", email, "active");

        given().
                spec(defaultRequest).
                body(createUserRequest).
        expect().
                spec(defaultResponse).
                body("data.name", equalTo(name)).
        when().
                post("https://gorest.co.in/public/v1/users");
    }
}
