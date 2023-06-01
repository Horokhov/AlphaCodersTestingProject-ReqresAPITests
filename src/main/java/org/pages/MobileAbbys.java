package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MobileAbbys extends PageTools {

    private final By mobileAbbysButton = By.xpath("//a[@class='btn btn-mobile btn-heavy']");

    private final By pageTitle = By.xpath("//h1[@class='title main-title']");
    public void goToMobileAbbys(){
        shouldBe(Condition.visible, mobileAbbysButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }
}