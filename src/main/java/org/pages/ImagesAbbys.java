package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ImagesAbbys extends PageTools {

    private final By imageAbbysButton = By.xpath("//a[@class='btn btn-image btn-heavy']");

    private final By imagesWord = By.xpath("//p[@class='header-white'][1]");

    private final By abbysWord = By.xpath("//p[@class='header-white'][2]");

    public void goToImagesAbbys(){
       shouldBe(Condition.visible, imageAbbysButton).click();
    }

    public String getTitle(){
        String images = getElementText(imagesWord);
        String abbys = getElementText(abbysWord);
        String imagesAbbys = images+" "+abbys;
        return imagesAbbys;
    }
}
