package in.reqres.crudoperations;

import in.reqres.TestBase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {

    @Test
    public void deleteUser() {

      given().log().all()
                .pathParam("id", 1)
                .when()
                .delete("/users/{id}")
                .then().log().all()
                .statusCode(204);

    }
}