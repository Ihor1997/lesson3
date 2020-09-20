package test.java.tests.api;

import org.testng.annotations.Test;
import test.java.utils.PropertyLoader;

import java.io.File;

import static io.restassured.RestAssured.given;

public class apiTest {

    Object createdId;
    String filePath = "src/test/java/tests/api/createProjectBody.json";

    @Test
    public void createProjectTest() {

        createdId = given()
                    .header("Authorization", "Bearer b07fd119de00073bf315389fd6927a90ecb18bb3")
                    .contentType("application/json")
                .body(new File(filePath))
                .when()
                    .post(PropertyLoader.loadProperty("api.Url") +"/projects")

                .then()
                .statusCode(200)
                .extract().path("id");

        System.out.println("ID = " + createdId);
    }



    @Test(dependsOnMethods = "createProjectTest")
    public void deleteProjectTest(){
        given()
         .header("Authorization", "Bearer b07fd119de00073bf315389fd6927a90ecb18bb3")
                .contentType("application/json").log().all()
                .when()
                .delete(PropertyLoader.loadProperty("api.Url") +"/projects/" +  createdId)
                .then().log().all()
                .statusCode(204);
    }
}