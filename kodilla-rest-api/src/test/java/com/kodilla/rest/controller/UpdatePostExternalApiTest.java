package com.kodilla.rest.controller;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdatePostExternalApiTest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static final int POST_ID = 1;

    @Test
    public void testUpdatePost() {
        given()
                .contentType(ContentType.JSON)
                .body("{ \"title\": \"Updated Title\", \"body\": \"Updated Body\", \"userId\": 1 }")
                .when()
                .put(BASE_URL + "/posts/" + POST_ID)
                .then()
                .statusCode(200)
                .body("id", equalTo(POST_ID))
                .body("title", equalTo("Updated Title"))
                .body("body", equalTo("Updated Body"))
                .body("userId", equalTo(1));
    }
}