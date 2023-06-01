package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;

public class LogOutTest extends PageTools implements BaseTest {

    @Test(description = "Verification that user is logged out when pressing lof out button")
    public void logOutTest(){
        PagesDriver.getLogginationPage().login("Username4567","1234567");

        PagesDriver.getHeader().openNavigationalHub();
        PagesDriver.getHeader().logOut();

        Assert.assertEquals(getCurrentUrl(),"https://alphacoders.com/users/logout");
    }
}
