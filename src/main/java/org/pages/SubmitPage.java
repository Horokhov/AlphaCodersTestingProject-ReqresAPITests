package org.pages;

import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class SubmitPage extends PageTools {

    public void uploadImage(String filename){
        $(By.xpath("//div[@id='file-type']//input")).click();
        $(By.xpath("//input[@type='file']")).uploadFile(new File(getFileByName(filename)));
        $(By.xpath("//input[@type='submit']")).click();
    }

    public boolean loadedVerification(){
        $(By.xpath("//progress[@value='100']")).shouldBe(Condition.exist);
        $(By.xpath("//div[@id='file-1-status']")).shouldBe(Condition.exist);
        return true;
    }
}