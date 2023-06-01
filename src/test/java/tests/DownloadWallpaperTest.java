package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class DownloadWallpaperTest extends PageTools implements BaseTest{

    @Test(description = "Verification that an image can be downloaded over a shortcut")
    public void imageDownloadTest() throws FileNotFoundException {
        PagesDriver.getLogginationPage().login("Username4567","1234567");
        PagesDriver.getHeader().openNavigationalHub();


        PagesDriver.getWallpaperAbbys().goToWallpaperAbbys();
        closeGooglePopUp();
        PagesDriver.getWallpaperAbbys().downloadPictureUsingShortcut();

    }

    @Test(description = "Verification that an image can be downloaded over an image page")
    public void imageDownloadMainTest() throws FileNotFoundException {
        PagesDriver.getLogginationPage().login("Username4567","1234567");
        PagesDriver.getHeader().openNavigationalHub();


        PagesDriver.getWallpaperAbbys().goToWallpaperAbbys();
        closeGooglePopUp();

        PagesDriver.getWallpaperAbbys().downloadPictureUsingMainPage();

    }
}