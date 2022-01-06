package restassuredTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DemoXMLRequest {
    @Test(priority = 1)
    public void testStatusCode() {
        given()
                .when()
                .get("http://jsonplaceholder.typicode.com/posts/5")
                .then()
                .statusCode(200);
        // .log().all();
    }
}
