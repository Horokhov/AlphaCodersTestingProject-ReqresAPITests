package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AvatarAbbys extends PageTools{
    private final By avatarAbbysButton = By.xpath("//a[@class='btn btn-avatar btn-heavy']");

    private final By pageTitle = By.xpath("//h1[@class='title main-title']");

    public void goToAvatarAbbys(){
        shouldBe(Condition.visible, avatarAbbysButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }
}