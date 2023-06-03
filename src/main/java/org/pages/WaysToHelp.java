package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class WaysToHelp extends PageTools {
    private final By waysToHelpButton = By.xpath("//a[contains(text(),'Ways To Help!')]");

    private final By pageTitle = By.xpath("//h1[@class='center title']");

    private final By amazonMerchLinks = By.xpath("//div[@class='panel-body']//a");
    public void goToWaysToHelp(){
        shouldBe(Condition.visible, waysToHelpButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }

    public List<String> merchUrls(){
        List<SelenideElement> merchElements = getElements(amazonMerchLinks);
        List<String> urls = new ArrayList<>();
        for (SelenideElement merchElement : merchElements) {
            String href = merchElement.getAttribute("href");
            urls.add(href);
        }
        return urls;
    }
}