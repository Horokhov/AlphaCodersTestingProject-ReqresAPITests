package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class ArtAbbys extends PageTools {

    private final By artAbbysButton = By.xpath("//a[@class='btn btn-art btn-heavy']");
    private final By artWord = By.xpath("//p[@class='header-white'][1]");

    private final By abbysWord = By.xpath("//p[@class='header-white'][2]");

    private final By links = By.xpath("//a");
    public void goToArtAbyss(){
        shouldBe(Condition.visible, artAbbysButton).click();
    }

    public String getTitle(){
        String art = getElementText(artWord);
        String abbys = getElementText(abbysWord);
        String artAbbys = art+" "+abbys;
        return artAbbys;
    }

    public List<String> getAllLinksOnPage(){
        List<SelenideElement> merchElements = getElements(links);
        List<String> urls = new ArrayList<>();
        for (SelenideElement merchElement : merchElements) {
            String href = merchElement.getAttribute("href");
            String src = merchElement.getAttribute("src");
            urls.add(href);
            urls.add(src);
        }
        urls.removeIf(link->link==null);
        return urls;
    }
}