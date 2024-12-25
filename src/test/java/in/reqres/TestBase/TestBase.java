package in.reqres.TestBase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt(){
        RestAssured.baseURI = "https://reqres.in/";
       // RestAssured.port = 8080;
        RestAssured.basePath = "/api";
    }

}
