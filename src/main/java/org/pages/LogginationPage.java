package org.pages;

import org.base.BaseTest;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogginationPage extends PageTools {
    public void login(String username, String password){
        $(By.xpath("//a[@href='https://alphacoders.com/users/login']")).click();
        $(By.xpath("//input[@name='username']")).append(username);
        $(By.xpath("//input[@name='password']")).append(password);
        $(By.xpath("//input[@type='submit']")).click();
    }
}