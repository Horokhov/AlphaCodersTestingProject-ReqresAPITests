package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class MainPageSearchTest extends PageTools implements BaseTest {

    @Test(description = "Verification that search output is giving results that were requested")
    public void aplhaCodersSearch(){
        String coderName = "Money";
        PagesDriver.getAlphaCodersMainPage().searchAlphaCoder(coderName);

        String titleVerification = PagesDriver.getWallpaperAbbys().getSearchTitle();

        Assert.assertTrue(titleVerification.contains(coderName));

        List<String> titles = PagesDriver.getWallpaperAbbys().getPicturesTitle();

        Assert.assertTrue(titles.stream().anyMatch(t -> t.contains(coderName)));
    }

    @Test(description = "Verification that search bar in the header output is giving results that were requested")
    public void headerSearch(){
        String coderName = "Money";
        PagesDriver.getHeader().searchBar(coderName);

        String titleVerification = PagesDriver.getWallpaperAbbys().getSearchTitle();

        Assert.assertTrue(titleVerification.contains(coderName));

        List<String> titles = PagesDriver.getWallpaperAbbys().getPicturesTitle();

        Assert.assertTrue(titles.stream().anyMatch(t -> t.contains(coderName)));
    }

}
