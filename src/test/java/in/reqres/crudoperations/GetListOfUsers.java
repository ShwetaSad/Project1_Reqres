package in.reqres.crudoperations;

import in.reqres.TestBase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetListOfUsers extends TestBase {

    @Test
    public void getlistOfUSers() {


    /*given()
                .when()
                .get("/list")
                .then().log().all()
                .statusCode(200);*/
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}