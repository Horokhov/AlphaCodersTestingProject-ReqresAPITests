package org.base;

import com.codeborne.selenide.*;
import com.codeborne.selenide.Browsers;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;

public interface BaseTest {
    @BeforeClass(alwaysRun = true, description = "Initializing WebDrivers")
    public default void initializeDriver() throws IOException {

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\max_h\\IdeaProjects\\AlphaCodersTestingProject\\src\\main\\resources\\GlobalData.properties");

        properties.load(fis);

        String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :properties.getProperty("browser");

        if(browserName.contains("chrome")){
            Configuration.browser = Browsers.CHROME;
        } else if (browserName.contains("edge")) {
            Configuration.browser = Browsers.EDGE;
        } else if (browserName.contains("firefox")) {
            Configuration.browser = Browsers.FIREFOX;
        } else if (browserName.contains("safari")){
            Configuration.browser = Browsers.SAFARI;
        }

        if (browserName.contains("headless")){
            Configuration.headless = true;
        }

        Configuration.screenshots = false;
        Configuration.reportsFolder = "downloads";
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadStrategy = "normal";
        Configuration.timeout = 5000;

        Configuration.browserSize = "1920x1080";
    }

    @BeforeMethod(alwaysRun = true, description = "Launching an application")
    public default void launchApplication(){
        Selenide.open("https://alphacoders.com/");
    }

    @AfterMethod(alwaysRun = true, description = "Closing an application")
    public default void closeApplication(){
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}