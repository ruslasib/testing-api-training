package ruslasib.Tests;

import io.restassured.http.Header;

final class ApplicationConstants {

    static final String BASE_URL = "https://gorest.co.in/public/v1";
    static final String USERS = "/users";

    static final String CONTENT_TYPE = "application/json";
    static final Header AUTHORIZATION = new Header("Authorization", "Bearer e739a2ae8d984e9a6f9c35de533e020bfe38263e1f4e8e443c97d8310aa9a9f5");

}
