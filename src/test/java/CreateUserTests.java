import com.github.javafaker.Faker;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateUserTests {

    @Test
    public void createUserTest()
    {
        Faker faker = new Faker();
        String name = String.valueOf(faker.name());
        String email = (name + ".rus@mailinatior.com");

        given().
                header("Authorization", "Bearer e739a2ae8d984e9a6f9c35de533e020bfe38263e1f4e8e443c97d8310aa9a9f5").
                queryParam("name", name.toString()).
                queryParam("gender", "male").
                queryParam("email", email.toString()).
                queryParam("status", "active").
        when().
                post("https://gorest.co.in/public/v1/users").
                then().
                statusCode(201).
                body("data.name", equalTo(name));
    }
}
