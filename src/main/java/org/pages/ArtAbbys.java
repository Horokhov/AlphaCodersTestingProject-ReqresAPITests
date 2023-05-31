package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ArtAbbys{

    public void goToArtAbyss(){
        $(By.xpath("//a[@class='btn btn-art btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String art = $(By.xpath("//p[@class='header-white'][1]")).text();
        String abbys = $(By.xpath("//p[@class='header-white'][2]")).text();
        String artAbbys = art+" "+abbys;
        return artAbbys;
    }
}