package restassuredTests;

import io.restassured.matcher.ResponseAwareMatcher;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get_Request {
    @Test
    public void getUsers() {
        given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employees")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"))
                .header("Content-Type","application/json");
    }

    @Test
    public void getEmployee() {
        given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employee/6")
                .then()
                .statusCode(200)
                .assertThat().body("data.employee_name",equalTo("Brielle Williamson"))
                .header("Content-Type","application/json")
                .log().all();
    }

}
