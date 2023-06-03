package tests;

import io.restassured.response.Response;
import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.jsoup.Connection;
import org.testng.Assert;
import org.testng.annotations.Test;
import restApiTest_components.Specifications;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ArtAbbysAllLinksTest extends PageTools implements BaseTest{

    @Test
    public void allLinksArtAbbysTest(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getArtAbbys().goToArtAbyss();
        closeGooglePopUp();
        List<String> urls = PagesDriver.getArtAbbys().getAllLinksOnPage();

        for (String url : urls) {
            Response response = given()
                    .when()
                    .get(url)
                    .then()
                    .log().all()
                    .extract().response();
            Assert.assertEquals(200, response.getStatusCode());
        }
}}
