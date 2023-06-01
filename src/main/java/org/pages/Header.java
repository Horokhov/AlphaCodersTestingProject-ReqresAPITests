package org.pages;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Header extends PageTools {
    public void openNavigationalHub() {
        $(By.className("navbar-brand")).shouldBe(Condition.visible).click();
    }

    public void submit() {
        $(By.xpath("//a[@title='Submit Contents']")).click();
    }

    public void coolStuff() {
        $(By.xpath("//a[@href='https://alphacoders.com/contest']")).click();
    }

    public void searchBar(String textToSearch){
        $(By.xpath("//input[@class='form-control']")).append(textToSearch);
        $(By.xpath("//button[@type='submit']")).click();
    }
    public void register(){
        $(By.xpath("//a[@href='https://alphacoders.com/users/register']")).click();
    }

    public void logOut(){
        $(By.xpath("//a[contains(text(), 'Logout')]")).click();
    }
}