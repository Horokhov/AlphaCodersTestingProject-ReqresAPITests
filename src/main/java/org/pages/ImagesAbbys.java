package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ImagesAbbys {

    public void goToImagesAbbys(){
        $(By.xpath("//a[@class='btn btn-image btn-heavy']")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String images = $(By.xpath("//p[@class='header-white'][1]")).text();
        String abbys = $(By.xpath("//p[@class='header-white'][2]")).text();
        String imagesAbbys = images+" "+abbys;
        return imagesAbbys;
    }
}
