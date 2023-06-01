package org.pages;

import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class SubmitPage extends PageTools {
    private final By uploadPageButton = By.xpath("//div[@id='file-type']//input");

    private final By uploadFileButton = By.xpath("//input[@type='file']");

    private final By submitUpload = By.xpath("//input[@type='submit']");

    private final By uploadedFileProgressBar100 = By.xpath("//progress[@value='100']");

    private final By uploadedFileStatus = By.xpath("//div[@id='file-1-status']");
    public void uploadImage(String filename){
        click(uploadPageButton);

        getElement(uploadFileButton).uploadFile(new File(getFileByName(filename)));
        click(submitUpload);
    }

    public boolean loadedVerification(){
        shouldBe(Condition.exist, uploadedFileProgressBar100);
        shouldBe(Condition.exist, uploadedFileStatus);
        return true;
    }
}