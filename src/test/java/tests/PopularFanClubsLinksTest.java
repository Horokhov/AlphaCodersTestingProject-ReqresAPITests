package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class PopularFanClubsLinksTest extends PageTools implements BaseTest {

    @Test(description = "Verification that popular fan clubs links are redirecting to the working urls")
    public void popularFanClubsLinksTest() throws IOException {
        PagesDriver.getAlphaCodersMainPage().toPopularFanClubsScroll();

        List<Integer> socialLinksCodes = PagesDriver.getAlphaCodersMainPage().popularFanClubsLinks("HEAD");

        SoftAssert softAssert = new SoftAssert();

        for(int codes:socialLinksCodes) {
            softAssert.assertTrue(codes < 400, "Social link is broken code: "+getCurrentUrl()+ codes);
        }

    }
}