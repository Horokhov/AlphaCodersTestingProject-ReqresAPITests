package org.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WallpaperAbbys extends PageTools {
    private final By wallpaperAbbysButton = By.xpath("//a[@class='btn btn-wallpaper btn-heavy']");

    private final By wallpaperWord = By.xpath("//p[@class='header-white wallpaper-header']");

    private final By abbysWord = By.xpath("//p[@class='header-white']");

    private final By imagesAmount = By.xpath("//div[@class='col-xs-12 col-sm-4'][2]//a//span");

    private final By categoriesAmount = By.xpath("//div[@class='col-xs-12 col-sm-4'][2]//a");

    private final By searchTitle = By.xpath("//h1[@class='title']");

    private final By picturesTitle = By.xpath("//div[@class='thumb-info']");

    private final By downloadWallpaperShortcutButton = By.xpath("//a[@title='Download Wallpaper']");

    private final By downloadWallpaperPageButton = By.xpath("//div[@class='boxgrid']//a");

    private final By downloadFile = By.xpath("//a[contains(@id, 'download')]");


    public void  goToWallpaperAbbys(){
        shouldBe(Condition.visible, wallpaperAbbysButton).click();
    }

    public String getTitle(){
        String wallpaper = getElementText(wallpaperWord);
        String abbys = getElementText(abbysWord);
        String wallpaperAbbys = wallpaper+" "+abbys;
        return wallpaperAbbys;
    }

    public List<SelenideElement> getCategoriesImagesAmount(){
        List<SelenideElement> amount = getElements(imagesAmount);
        return amount;
    }

    public List<SelenideElement> goToCategoryAndGetImageAmount(){
        List<SelenideElement> categories = getElements(categoriesAmount);
        return categories;
    }

    public String getSearchTitle(){
        String title = getElementText(searchTitle);
        return title;
    }

    public List<String> getPicturesTitle(){
        List<String> picTitles = getElementsText(picturesTitle);
        return picTitles;
    }

    public void downloadPictureUsingShortcut() throws FileNotFoundException {
        getElement(downloadWallpaperPageButton).scrollIntoView(true);
        closeGooglePopUp();

        File download = getElement(downloadWallpaperShortcutButton).download();
    }

    public void downloadPictureUsingMainPage() throws FileNotFoundException {
        getElement(downloadWallpaperPageButton).scrollIntoView(true);
        click(downloadWallpaperPageButton);
        closeGooglePopUp();

        Selenide.sleep(3000);
        File download = getElement(downloadFile).download();
    }



}