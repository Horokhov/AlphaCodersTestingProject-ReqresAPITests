package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GamesAbbys {

    public void goToGamesAbbys(){
        $(By.xpath("//a[@class='btn btn-game btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String title = $(By.xpath("//h1[@class='title']")).text();
        return title;
    }
}