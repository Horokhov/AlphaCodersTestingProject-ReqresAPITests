package tests;

import io.restassured.response.Response;
import org.base.BaseTest;
import org.base.PagesDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import restApiTest_components.Specifications;

import java.util.List;

import static io.restassured.RestAssured.given;

public class WaysToHelpMerchTest implements BaseTest {

    @Test(description = "Verification that merchandise links to Amazon.com are valid by getting status codes 200 for each link")
    public void waysToHelpMerchLinksTest(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getWaysToHelp().goToWaysToHelp();


        List<String> urls = PagesDriver.getWaysToHelp().merchUrls();

        for (String url : urls) {
            int response = given()
                    .when()
                    .get(url)
                    .then()
                    .log().all()
                    .extract()
                    .statusCode();
            Assert.assertEquals(200, response);
        }
    }
}
