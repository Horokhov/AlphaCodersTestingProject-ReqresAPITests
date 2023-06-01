package tests;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import restApiTest_components.Specifications;
import restApiTest_components.UserData;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestClass {
    private static final String baseUrl = "https://reqres.in/";

    @Test
    public void getUsers(){
        Specifications.getSpecifications(Specifications.requestSpecification(baseUrl), Specifications.responseSpecification(200));
        List<UserData> data = given()
                .when()
                .get("api/users?page")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        for (UserData datum : data) {
            Assert.assertTrue(datum.getAvatar().contains(datum.getId().toString()));
            Assert.assertTrue(datum.getEmail().contains("@reqres.in"));
        }
    }

    @Test
    public void createUser(){

    }
}
