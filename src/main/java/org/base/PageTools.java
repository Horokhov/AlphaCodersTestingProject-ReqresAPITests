package org.base;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTools extends  CustomLogger{

    private static String getPreviousMethodNameAsText(){
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        String replacedName = methodName.replaceAll(String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " ");
        return replacedName.substring(0,1).toUpperCase() + replacedName.substring(1).toLowerCase();
    }

    public By byLocator (By by , Object... args){
        return LocatorParser.parseLocator(by,args);
    }
    protected SelenideElement shouldBe(Condition condition, By by , Object... args){
        return $(byLocator(by,args)).shouldBe(condition);
    }
    protected ElementsCollection shouldBe(CollectionCondition condition, By by , Object... args){
        return $$(byLocator(by,args)).shouldBe(condition);
    }
    protected void type(String text, By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        shouldBe(Condition.visible, by , args).append(text);
    }
    protected void click(By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        shouldBe(Condition.enabled, by, args).click();
    }

    protected void mouseHover(By by, Object... args){
        logInfo(getPreviousMethodNameAsText()+" ', element -> " + byLocator(by,args));
        shouldBe(Condition.visible, by, args).hover();
    }

    protected void scroll(By by, Object... args){
        logInfo(getPreviousMethodNameAsText()+" ', element -> " + byLocator(by,args));
        shouldBe(Condition.visible, by, args).scrollIntoView(true);
    }

    protected void clickEnterKey(){
        Selenide.actions().sendKeys(Keys.ENTER).perform();
    }

    protected void clickEscapeKey(){
        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
    }

    protected void waitForElementVisibility(By by, Object... args){
        shouldBe(Condition.visible, by, args);
    }

    public boolean isElementExist (By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element exists -> " + byLocator(by,args));
        return $(byLocator(by,args)).is(Condition.visible);
    }

    public SelenideElement getElement(By by, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(Condition.enabled, by, args);
    }

    public String getElementText(By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(Condition.visible, by, args).text();
    }
    public List<String> getElementsText(By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', elements -> " + byLocator(by,args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1), by, args).texts();
    }
    public List<SelenideElement> getElements(By by, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', elements -> " + byLocator(by,args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1), by, args);
    }

    public void closeGooglePopUp(){

        if(WebDriverRunner.getWebDriver().getCurrentUrl().contains("#google_vignette")){
            Selenide.switchTo().frame("aswift_1");
            Selenide.switchTo().frame("ad_iframe");

            try {
                $(By.id("dismiss-button")).click();
            } catch (Exception e){
                System.out.println("Ignoring the exception");
            }

        }}

    public String getCurrentUrl(){
        String url = WebDriverRunner.getWebDriver().getCurrentUrl();
        return url;
    }

    public String getFileByName(String name){
        return new File("src/main/resources/"+name).getAbsolutePath();
    }

}