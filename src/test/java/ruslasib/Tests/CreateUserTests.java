package ruslasib.Tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ruslasib.Models.CreateUser.CreateUserRequest;
import ruslasib.Models.CreateUser.CreateUserResponse.CreateUserResponse;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;
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
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String email = name + ".rus@mailinatior.com";
        CreateUserRequest createUserRequest = new CreateUserRequest(name, "male", email, "active");

//        given().
//                spec(defaultRequest).
//                body(createUserRequest);
//        expect().
//                spec(defaultResponse).
//                body("data.name", equalTo(name)).
//        when().
//                post(url);


//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        String json = post(url).getBody().jsonPath().get().toString();
//        CreateUserResponse response = null;
//        try {
//            response = objectMapper.readValue(json, CreateUserResponse.class);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }

        CreateUserResponse response =
                given().
                    spec(defaultRequest).
                    body(createUserRequest).
                        when().post(url).as(CreateUserResponse.class);

        assertThat(response.getData().getName(), equalTo("name"));
    }
}
