package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class CodersNetworkLinksTest extends PageTools implements BaseTest {
    @Test(description = "Verification that all Network Links are redirecting to the working urls")
    public void alphaCodersNetworkLinksTest() throws IOException, InterruptedException {
        PagesDriver.getAlphaCodersMainPage().toFooterScroll();

        List<Integer> socialLinksCodes = PagesDriver.getAlphaCodersMainPage().alphaCodersNetworkLinks("HEAD");

        SoftAssert softAssert = new SoftAssert();

        for(int codes:socialLinksCodes) {
            softAssert.assertTrue(codes < 400, "Social link is broken code: "+getCurrentUrl()+ codes);
        }

    }
}