package restassuredTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class DemoBasicValidations {

    //status code
    @Test(priority = 1)
    public void testStatusCode() {
        given()
                .when()
                .get("http://jsonplaceholder.typicode.com/posts/5")
                .then()
                .statusCode(200);
               // .log().all();
    }

    @Test(priority = 2)
    public void testlogResponse() {
        given()
                .when()
                .get("http://jsonplaceholder.typicode.com/posts/3")
                .then()
                .statusCode(200)
                .log().all();

    }
@Test(priority=3)
    public void testSingleContent() {
        given()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .body("data.first_name",equalTo("Janet"));
    }
    @Test(priority=4)
    public void testMultipleContent() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.last_name",hasItems("Fields","Edwards","Howell"));

    }

    @Test(priority=5)
    public void testParamsHeaders() {
        given()
                .param("MyName","Usha")
                .header("MyHeader","Indian")
                .when()
                .get("https://reqres.in/api/users/3")
                .then()
                .statusCode(200)
                .log().all();

    }

}
