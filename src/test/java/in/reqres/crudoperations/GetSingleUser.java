package in.reqres.crudoperations;

import in.reqres.TestBase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSingleUser extends TestBase {

    @Test
    public void getSingUser() {

        Response response = given()
                .pathParam("id",1)
                .when()
                .get("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}