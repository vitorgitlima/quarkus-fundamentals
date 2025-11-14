package org.glima.starting;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
class BookResourceTest {


    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/books")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

}