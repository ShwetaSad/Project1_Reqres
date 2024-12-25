package in.reqres.crudoperations;

import in.reqres.TestBase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VerifyTheData extends TestBase {


    @Test
    public void verifyPageis2(){

     Response response = given()
        .param("page",2)
             .when()
             .get("/users");
     response.prettyPrint();
     response.then().statusCode(200);

    }

    @Test
    public void verifyPerPageis6(){
        Response response = given()
                .param("per_page",6)
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void verifyinData1theIdis8(){

        Response response =given()
                .param("data",1)
                .param("id",8)
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);

    }
    @Test
    public void verifyinData3FirstnameisByron(){
        Response response =given()
                .param("page",2)
                .param("data",3)
                .param("first_name","Byron")
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);

    }
    @Test
    public void verifyAvatarOfData5(){
        Response response=given()
                .param("page",2)
                .param("data",5)
                .param("avatar","https://reqres.in/img/faces/11-image.jpg")
                .when()
                .get("/users");
          response.prettyPrint();
          response.then().statusCode(200);
    }


}
