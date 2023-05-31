package tests;

import org.base.BaseTest;
import org.base.PagesDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class PopularContentLinksTest extends BaseTest {
    @Test(description = "Verification that popular content links are redirecting to the working urls")
    public void popularContentLinksTest() throws IOException {
        PagesDriver.getAlphaCodersMainPage().toPopularContentScroll();

        List<Integer> socialLinksCodes = PagesDriver.getAlphaCodersMainPage().popularContentLinks("HEAD");

        SoftAssert softAssert = new SoftAssert();

        for(int codes:socialLinksCodes) {
            softAssert.assertTrue(codes < 400, "Social link is broken code: "+getCurrentUrl()+ codes);
        }

    }
}
