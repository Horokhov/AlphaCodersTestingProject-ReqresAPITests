package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GamesAbbys extends PageTools {
    private final By gameAbbysButton = By.xpath("//a[@class='btn btn-game btn-heavy']");
    private final By pageTitle = By.xpath("//h1[@class='title']");
    public void goToGamesAbbys(){
        shouldBe(Condition.visible, gameAbbysButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }
}