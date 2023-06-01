package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class TVAbbys extends PageTools {
    private final By tvAbbysButton = By.xpath("//a[@class='btn btn-tv btn-heavy']");

    private final By pageTitle = By.xpath("//h1[@class='title']");
    public void goToTvAbbys(){
        shouldBe(Condition.visible, tvAbbysButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }
}
