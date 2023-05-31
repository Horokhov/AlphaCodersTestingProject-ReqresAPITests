package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MobileAbbys {

    public void goToMobileAbbys(){
        $(By.xpath("//a[@class='btn btn-mobile btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String title = $(By.xpath("//h1[@class='title main-title']")).text();
        return title;
    }
}