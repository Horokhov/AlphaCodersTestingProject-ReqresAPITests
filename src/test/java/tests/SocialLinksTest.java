package tests;

import org.base.BaseTest;
import org.base.PagesDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class SocialLinksTest extends BaseTest {

    @Test(description = "Verification that social links are redirecting to the working urls")
    public void brokenSocialsTest() throws IOException {
        List<Integer> socialLinksCodes = PagesDriver.getAlphaCodersMainPage().getSocialLinksCodes("HEAD");

        SoftAssert softAssert = new SoftAssert();

        for(int codes:socialLinksCodes) {
            softAssert.assertTrue(codes < 400, "Social link is broken code: "+getCurrentUrl()+ codes);
        }

    }
}