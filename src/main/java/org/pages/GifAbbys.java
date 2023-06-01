package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GifAbbys extends PageTools {

    private final By gifAbbysButton = By.xpath("//a[@class='btn btn-gif btn-heavy']");
    private final By gifWord = By.xpath("//p[@class='header-white'][1]");

    private final By abbysWord = By.xpath("//p[@class='header-white'][2]");
    public void goToGifAbbys(){
        shouldBe(Condition.visible, gifAbbysButton).click();
    }

    public String getTitle(){
        String gif = getElementText(gifWord);
        String abbys = getElementText(abbysWord);
        String gifAbbys = gif+" "+abbys;
        return gifAbbys;
    }
}