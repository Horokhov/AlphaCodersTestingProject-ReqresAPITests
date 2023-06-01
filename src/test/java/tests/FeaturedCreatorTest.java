package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class FeaturedCreatorTest extends PageTools implements BaseTest {

    @Test(description = "Verification that link to the featured artist is redirecting to the profile of this artist")
    public void featuredCreatorTest(){
        String mainPageName = PagesDriver.getAlphaCodersMainPage().getFeaturedCreatorName();

        closeGooglePopUp();
        PagesDriver.getAlphaCodersMainPage().goToFeaturedCreatorProfile();
        closeGooglePopUp();

        String profileName = PagesDriver.getAlphaCodersMainPage().getFeaturedCreatorNameInCreatorProfile();
        Assert.assertEquals(mainPageName, profileName);

        Assert.assertTrue(getCurrentUrl().contains("https://alphacoders.com/users/profile/"));
    }

    @Test(description = "Verification that 'wallpaper' button of featured creator is redirecting to this creator's wallpapers")
    public void featuredCreatorWallpapersTest() throws InterruptedException {
        String mainPageName = PagesDriver.getAlphaCodersMainPage().getFeaturedCreatorName();

        closeGooglePopUp();
        PagesDriver.getAlphaCodersMainPage().goToCreatorsWalls();
        closeGooglePopUp();

        Assert.assertTrue($(By.xpath("//h1[@class='title']")).text().contains(mainPageName));
    }

    @Test(description = "Verification that 'image' button of featured creator is redirecting to this creator's images")
    public void featuredCreatorImagesTest() throws InterruptedException {
        String mainPageName = PagesDriver.getAlphaCodersMainPage().getFeaturedCreatorName();

        closeGooglePopUp();
        PagesDriver.getAlphaCodersMainPage().goToCreatorsImages();
        closeGooglePopUp();

        Assert.assertTrue($(By.xpath("//h1[@class='title']")).text().contains(mainPageName));
    }

}
