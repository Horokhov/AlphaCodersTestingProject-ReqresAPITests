package tests;

import org.base.BaseTest;
import org.base.PageTools;
import org.base.PagesDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageUploadTest extends PageTools implements BaseTest{

    @Test(description = "Uploading an image using submit button")
    public void imageUpload(){
        PagesDriver.getLogginationPage().login("Username4567","1234567");
        PagesDriver.getHeader().submit();

        closeGooglePopUp();
        PagesDriver.getSubmitPage().uploadImage("Cat.jpg");
        Assert.assertTrue(PagesDriver.getSubmitPage().loadedVerification());
    }
}