package in.reqres.crudoperations;

import in.reqres.TestBase.TestBase;
import in.reqres.model.UserPojo;
import in.reqres.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateAUser extends TestBase {

     @Test
    public void createAUser(){

        String email = TestUtils.getRandomValue() + "Shaveta@gmail.com";


        UserPojo userPojo = new UserPojo();
        userPojo.setFirstName("Shaveta");
        userPojo.setLastName("Sadhwani");
        userPojo.setEmail(email);


        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post("/users");
        response.prettyPrint();
        response.then().statusCode(201);
    }
    }

