package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DiscussionsAbbys extends PageTools {

    private final By discussionsAbbysButton = By.xpath("//a[@class='btn btn-community btn-heavy']");

    private final By discussionsWord = By.xpath("//p[@class='header-white wallpaper-header']");

    private final By abbysWord = By.xpath("//p[@class='header-white']");
    public void goToDiscAbbys(){
        shouldBe(Condition.visible, discussionsAbbysButton).click();
    }

    public String getTitle(){
        String discussions = getElementText(discussionsWord);
        String abbys = getElementText(abbysWord);
        String discussionsAbbys = discussions+" "+abbys;
        return discussionsAbbys;
    }
}