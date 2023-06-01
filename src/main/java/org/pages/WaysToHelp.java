package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WaysToHelp extends PageTools {
    private final By waysToHelpButton = By.xpath("//a[contains(text(),'Ways To Help!')]");

    private final By pageTitle = By.xpath("//h1[@class='center title']");
    public void goToWaysToHelp(){
        shouldBe(Condition.visible, waysToHelpButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }
}