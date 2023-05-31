package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DiscussionsAbbys {
    public void goToDiscAbbys(){
        $(By.xpath("//a[@class='btn btn-community btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String discussions = $(By.xpath("//p[@class='header-white wallpaper-header']")).text();
        String abbys = $(By.xpath("//p[@class='header-white']")).text();
        String discussionsAbbys = discussions+" "+abbys;
        return discussionsAbbys;
    }
}