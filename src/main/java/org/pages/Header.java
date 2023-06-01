package org.pages;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Header extends PageTools {
    private final By navHubButton = By.className("navbar-brand");

    private final By submitButton = By.xpath("//a[@title='Submit Contents']");

    private final By coolStuffButton = By.xpath("//a[@href='https://alphacoders.com/contest']");

    private final By searchBar = By.xpath("//input[@class='form-control']");

    private final By submitSearchButton = By.xpath("//button[@type='submit']");

    private final By registerButton = By.xpath("//a[@href='https://alphacoders.com/users/register']");

    private final By logOutButton = By.xpath("//a[contains(text(), 'Logout')]");
    public void openNavigationalHub() {
        shouldBe(Condition.visible, navHubButton).click();
    }

    public void submit() {
        click(submitButton);
    }

    public void coolStuff() {
        click(coolStuffButton);
    }

    public void searchBar(String textToSearch){
        type(textToSearch,searchBar);
        click(submitSearchButton);
    }
    public void register(){
        click(registerButton);
    }

    public void logOut(){
        click(logOutButton);
    }
}