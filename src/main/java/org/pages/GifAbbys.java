package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GifAbbys {

    public void goToGifAbbys(){
        $(By.xpath("//a[@class='btn btn-gif btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String gif = $(By.xpath("//p[@class='header-white'][1]")).text();
        String abbys = $(By.xpath("//p[@class='header-white'][2]")).text();
        String gifAbbys = gif+" "+abbys;
        return gifAbbys;
    }
}