package main.java.last_homework;

import org.testng.annotations.Test;
import test.java.utils.PropertyLoader;

import java.io.File;

import static io.restassured.RestAssured.*;

public class Api_test_1 {


    Object createdId;
    String filePathCreateProject = "src/test/java/tests/api/createProjectBody.json";
    String getFilePathUpdateProject = "src/test/java/tests/api/updateProjectBody.json";


    @Test(priority = 1)
    public void createProjectTest() {

        createdId = given()
                .header("Authorization", "Bearer b07fd119de00073bf315389fd6927a90ecb18bb3")
                .contentType("application/json")
                .body(new File(filePathCreateProject))
                .when()
                .post(PropertyLoader.loadProperty("api.Url") +"/projects")

                .then()
                .statusCode(200)
                .extract().path("id");

        System.out.println("ID = " + createdId);
    }

    @Test(priority = 2)
    public void readProject(){

        given()
                .header("Authorization", "Bearer b07fd119de00073bf315389fd6927a90ecb18bb3")
                .contentType("application/json")
                .when()
                .get(PropertyLoader.loadProperty("api.Project.Url") + createdId)
                .then().log().all()
                .statusCode(200);


    }


    @Test(priority = 3)
    public void updateProject(){

        given()
                .header("Authorization", "Bearer b07fd119de00073bf315389fd6927a90ecb18bb3")
                .contentType("application/json")
                .body(new File(getFilePathUpdateProject))
                .when()
                .post(PropertyLoader.loadProperty("api.Project.Url") + createdId)
                .then()
                .statusCode(204);

    }


    @Test(priority = 4)
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
