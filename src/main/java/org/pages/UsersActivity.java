package org.pages;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UsersActivity extends PageTools {
    private final By usersActivityButton = By.xpath("//a[contains(text(),'Users Activity')]");

    private final By pageTitle = By.xpath("//h1[@class='center title']");
    public void goToUsersActivity(){
        shouldBe(Condition.visible, usersActivityButton).click();
    }

    public String getTitle(){
        String title = getElementText(pageTitle);
        return title;
    }
}
