package Tests;

import Models.CreateUserRequest;
import com.github.javafaker.Faker;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateUserTests {

    @Test
    public void createUserTest()
    {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String email = (name + ".rus@mailinatior.com");
        CreateUserRequest createUserRequest = new CreateUserRequest(name, "male", email, "active");

        given().
                header("Authorization", "Bearer e739a2ae8d984e9a6f9c35de533e020bfe38263e1f4e8e443c97d8310aa9a9f5").
                contentType("application/json").
                body(createUserRequest).
        when().
                post("https://gorest.co.in/public/v1/users").
                then().
                statusCode(201).
                body("data.name", equalTo(name));
    }
}
