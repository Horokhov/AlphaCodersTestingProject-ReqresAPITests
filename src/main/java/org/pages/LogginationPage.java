package org.pages;

import org.base.BaseTest;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogginationPage extends PageTools {
    private final By loginButton = By.xpath("//a[@href='https://alphacoders.com/users/login']");

    private final By usernameField = By.xpath("//input[@name='username']");

    private final By passwordField = By.xpath("//input[@name='password']");

    private final By submitLogginationButton = By.xpath("//input[@type='submit']");
    public void login(String username, String password){
        click(loginButton);
        type(username, usernameField);
        type(password, passwordField);
        click(submitLogginationButton);
    }
}