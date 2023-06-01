package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.testng.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NavigationHubTest extends PageTools implements BaseTest {

    @Test
    public void wallpaperBar() throws InterruptedException {
        PagesDriver.getHeader().openNavigationalHub();


        PagesDriver.getWallpaperAbbys().goToWallpaperAbbys();

        closeGooglePopUp();

        String wallpaperAbbys = PagesDriver.getWallpaperAbbys().getTitle();
        System.out.println(wallpaperAbbys);
        Assert.assertEquals(wallpaperAbbys,"WALLPAPER ABYSS");

        Assert.assertEquals(getCurrentUrl(), "https://wall.alphacoders.com/");
    }

    @Test
    public void mobileBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getMobileAbbys().goToMobileAbbys();
        closeGooglePopUp();
        Assert.assertEquals(getCurrentUrl(),"https://mobile.alphacoders.com/");

        String title = PagesDriver.getMobileAbbys().getTitle();
        Assert.assertEquals(title, "Welcome To Mobile Abyss!");
    }

    @Test
    public void artBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getArtAbbys().goToArtAbyss();

        closeGooglePopUp();
        Assert.assertEquals(getCurrentUrl(),"https://art.alphacoders.com/");

        String title = PagesDriver.getArtAbbys().getTitle();
        Assert.assertEquals(title, "ART ABYSS");
    }

    @Test
    public void imagesBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getImagesAbbys().goToImagesAbbys();
        closeGooglePopUp();
        Assert.assertEquals(getCurrentUrl(),"https://pics.alphacoders.com/");

        String title = PagesDriver.getImagesAbbys().getTitle();
        Assert.assertEquals(title, "IMAGE ABYSS");
    }

    @Test
    public void avatarsBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getAvatarAbbys().goToAvatarAbbys();

        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://avatars.alphacoders.com/");

        String title = PagesDriver.getAvatarAbbys().getTitle();
        Assert.assertEquals(title, "Welcome To Avatar Abyss!");
    }

    @Test
    public void gifBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getGifAbbys().goToGifAbbys();

        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://gifs.alphacoders.com/");

        String title = PagesDriver.getGifAbbys().getTitle();
        Assert.assertEquals(title, "GIF ABYSS");
    }

    @Test
    public void gamesBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getGamesAbbys().goToGamesAbbys();
        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://games.alphacoders.com/");

        String title = PagesDriver.getGamesAbbys().getTitle();
        Assert.assertEquals(title, "Welcome To Game Abyss!");
    }

    @Test
    public void moviesBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getMoviesAbbys().goToMoviesAbbys();

        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://movies.alphacoders.com/");

        String title = PagesDriver.getMoviesAbbys().getTitle();
        Assert.assertEquals(title, "Welcome To Movie Abyss!");
    }

    @Test
    public void tvBar(){
        PagesDriver.getHeader().openNavigationalHub();
        PagesDriver.getTvAbbys().goToTvAbbys();

        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://tvshows.alphacoders.com/");

        String title = PagesDriver.getTvAbbys().getTitle();
        Assert.assertEquals(title, "Welcome To TV Abyss!");
    }

    @Test
    public void discussionsBar(){
        PagesDriver.getHeader().openNavigationalHub();

        PagesDriver.getDiscussionsAbbys().goToDiscAbbys();
        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://communities.alphacoders.com/");

        String title = PagesDriver.getDiscussionsAbbys().getTitle();
        Assert.assertEquals(title, "COMMUNITY ABYSS");
    }

    @Test
    public void waysToHelpBar(){
        PagesDriver.getHeader().openNavigationalHub();
        PagesDriver.getWaysToHelp().goToWaysToHelp();

        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://alphacoders.com/site/help");

        String title = PagesDriver.getWaysToHelp().getTitle();
        Assert.assertEquals(title, "Helping Alpha Coders");
    }

    @Test
    public void usersActivityBar(){
        PagesDriver.getHeader().openNavigationalHub();
        PagesDriver.getUsersActivity().goToUsersActivity();

        closeGooglePopUp();

        Assert.assertEquals(getCurrentUrl(),"https://alphacoders.com/site/recent_activity");

        String title = PagesDriver.getUsersActivity().getTitle();
        Assert.assertEquals(title, "Recent User Activity");
    }
}
