package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import restApiTest_components.*;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RestApiTests {
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
            Assert.assertTrue(datum.getAvatar().contains(String.valueOf(datum.getId())));
            Assert.assertTrue(datum.getEmail().contains("@reqres.in"));
        }
    }

    @Test
    public void getSingleUser(){
        Specifications.getSpecifications(Specifications.requestSpecification(baseUrl), Specifications.responseSpecification(200));
        int id=2;
        UserData response = given()
                .when()
                .get("/api/users/2")
                .then()
                .log().all()
                .extract()
                .body().jsonPath().getObject("data", UserData.class);

        Assert.assertEquals(id,response.getId());
        Assert.assertTrue(response.getEmail().contains("@reqres.in"));
        Assert.assertTrue(!response.getFirst_name().isEmpty());
        Assert.assertTrue(!response.getLast_name().isEmpty());
    }

    @Test
    public void createUser(){
        Specifications.getSpecifications(Specifications.requestSpecification(baseUrl),Specifications.responseSpecification(201));

        CreateUserResponse rq = new CreateUserResponse();

        rq.setName("morpheus");
        rq.setJob("leader");

        CreateUserResponse response = given()
                .body(rq)
                .when().post("/api/users")
                .then().log().all()
                .extract()
                .as(CreateUserResponse.class);

        Assert.assertEquals(response.getName(), rq.getName());
    }

    @Test
    public void registerUser(){
        Specifications.getSpecifications(Specifications.requestSpecification(baseUrl),Specifications.responseSpecification(200));

        int id  = 4;
        String token = "QpwL5tke4Pnpja7X4";

        RegisterRequest user = new RegisterRequest("eve.holt@reqres.in","pistol");

        RegisterResponse response = given()
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(RegisterResponse.class);

        Assert.assertEquals(token, response.getToken());
        Assert.assertEquals(id,response.getId());
    }

    @Test
    public void updateUser(){
        Specifications.getSpecifications(Specifications.requestSpecification(baseUrl),Specifications.responseSpecification(200));

        UpdateUserRequest request = new UpdateUserRequest();
        request.setName("morpheus");
        request.setJob("zion resident");

        UpdateUserResponse response = given()
                .body(request)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .extract().as(UpdateUserResponse.class);

        Assert.assertEquals(request.getName(),response.getName());
        Assert.assertEquals(request.getJob(),response.getJob());
    }
}
