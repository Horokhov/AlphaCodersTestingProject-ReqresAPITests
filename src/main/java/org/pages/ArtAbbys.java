package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ArtAbbys extends PageTools {

    private final By artAbbysButton = By.xpath("//a[@class='btn btn-art btn-heavy']");
    private final By artWord = By.xpath("//p[@class='header-white'][1]");

    private final By abbysWord = By.xpath("//p[@class='header-white'][2]");
    public void goToArtAbyss(){
        shouldBe(Condition.visible, artAbbysButton).click();
    }

    public String getTitle(){
        String art = getElementText(artWord);
        String abbys = getElementText(abbysWord);
        String artAbbys = art+" "+abbys;
        return artAbbys;
    }
}