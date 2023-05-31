package org.pages;

import org.base.BaseTest;
import org.base.PagesDriver;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WallpaperAbbys extends BaseTest{

    public void  goToWallpaperAbbys(){
        $(By.xpath("//a[@class='btn btn-wallpaper btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String wallpaper = $(By.xpath("//p[@class='header-white wallpaper-header']")).shouldBe(Condition.visible).text();
        String abbys = $(By.xpath("//p[@class='header-white']")).shouldBe(Condition.visible).text();
        String wallpaperAbbys = wallpaper+" "+abbys;
        return wallpaperAbbys;
    }

    public ElementsCollection getCategoriesImagesAmount(){
        ElementsCollection amount = $$(By.xpath("//div[@class='col-xs-12 col-sm-4'][2]//a//span"));
        return amount;
    }

    public ElementsCollection goToCategoryAndGetImageAmount(){
        ElementsCollection categories = $$(By.xpath("//div[@class='col-xs-12 col-sm-4'][2]//a"));
        return categories;
    }

    public String getSearchTitle(){
        String title = $(By.xpath("//h1[@class='title']")).text();
        return title;
    }

    public List<String> getPicturesTitle(){
        List<String> picTitles = $$(By.xpath("//div[@class='thumb-info']")).texts();
        return picTitles;
    }

    public void downloadPictureUsingShortcut() throws FileNotFoundException {
        $(By.xpath("//a[@title='Download Wallpaper']")).scrollIntoView(true);
        closeGooglePopUp();
        File download = $(By.xpath("//a[@title='Download Wallpaper']")).download();
    }

    public void downloadPictureUsingMainPage() throws FileNotFoundException {
        $(By.xpath("//img[contains(@alt, 'Wallpaper')]")).scrollIntoView(true).click();
        closeGooglePopUp();
        File download = $(By.xpath("//a[contains(@id, 'download')]")).download();
    }



}