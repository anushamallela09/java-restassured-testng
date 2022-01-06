package restassuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Post_Request {

    public static HashMap map = new HashMap();
    @BeforeClass
    public void postdata() {
        map.put("EmployeeName",RestUtils.getEmployeeName());
        map.put("Salary",RestUtils.getRandom(5000));
        map.put("age",RestUtils.getage(10));

        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
        RestAssured.basePath = "/create";
    }
    @Test
    public void testpost()
    {
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .post()
                .then()
                .statusCode(200)
                .and()
                .body("message",equalTo("Successfully! Record has been added."));

    }
}
