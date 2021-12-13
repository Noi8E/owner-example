package ru.bazt;

import config.APIConfig;
import io.restassured.response.Response;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class ExampleAPITests extends TestBase {
    @Test
    @Tag("API-test")
    @DisplayName("Just verify 200 OK")
    public void checkResponseStatus() {
        apiConfig = ConfigFactory.create(APIConfig.class, System.getProperties());
        Response response =
                given()
                        .cookie(apiConfig.getCookie())
                        .when()
                        .get(apiConfig.getBaseUrl())
                        .then()
                        .statusCode(200)
                .extract().response();

    }


}
