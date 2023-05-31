package org.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UsersActivity {

    public void goToUsersActivity(){
        $(By.xpath("//a[contains(text(),'Users Activity')]")).shouldBe(Condition.visible).click();
    }

    public String getTitle(){
        String title = $(By.xpath("//h1[@class='center title']")).text();
        return title;
    }
}
