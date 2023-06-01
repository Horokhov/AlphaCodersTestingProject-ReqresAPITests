package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.jsoup.nodes.Entities.EscapeMode.base;

public class AlphaCodersMainPage extends PageTools {

    private final By searchButton = By.xpath("//button[@class='btn-search-bar btn btn-default btn-lg']");
    private final By  searchField = By.xpath("//input[@placeholder='Search Alpha Coders']");

    private final By linksListSocial = By.xpath("//div[@class='list-group list-group-follow']//a");

    private final By featuredCreatorLink = By.xpath("//div[contains(@class, 'feature-artist')]");

    private final By featuredCreatorToProfile = By.xpath("//span[@class='feature-profile']//a[1]");

    private final By creatorWallpapersButton = By.xpath("//div[@class='feature-bottom']//a[contains(text(), 'Wallpapers')]");

    private final By featuredCreatorName = By.xpath("//span[@class='feature-profile']//a[1]");

    private final By featuredCreatorNameInProfile = By.xpath("//h1[@class='title']");

    private final By featuredCreatorImagesButton = By.xpath("//div[@class='feature-bottom']//a[contains(text(), 'Images')]");

    private final By networkLinks = By.xpath("//div[@class='footer']//ul//li//a[contains(@href, '/')]");

    private final By popularContentLinks = By.xpath("//div[@id='popular_collections']//ul//li//a");

    private final By fanClubsLinks = By.xpath("//div[@class='row-with-preview-container']//div[@class='content-info center']//a");

    private final By footer = By.xpath("//div[@class='footer']");

    private final By popularContent = By.xpath("//h1[contains(text(), 'Popular Content')]");

    private final By popularFanClubs = By.xpath("//h1[contains(text(), 'Popular Fan Clubs')]");
    public void searchAlphaCoder(String coderName){
        type(coderName,searchField);
        click(searchButton);
    }

    public List<Integer> getSocialLinksCodes(String requestMethod) throws IOException {

        List<SelenideElement> links = getElements(linksListSocial);

        List<Integer> codes = new ArrayList<>();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
            connection.setRequestMethod(requestMethod);
            connection.connect();

            int responseCode = connection.getResponseCode();
            codes.add(responseCode);
        }
        return codes;
    }

    public void goToFeaturedCreatorProfile(){
        mouseHover(featuredCreatorLink);
        click(featuredCreatorToProfile);
    }

    public void goToCreatorsWalls() throws InterruptedException {
        mouseHover(creatorWallpapersButton);
        click(creatorWallpapersButton);
    }

    public String getFeaturedCreatorName(){
        String name = getElementText(featuredCreatorName);
        return name;
    }

    public String getFeaturedCreatorNameInCreatorProfile(){
        String name = getElementText(featuredCreatorNameInProfile);
        return name;
    }

    public void goToCreatorsImages() throws InterruptedException {
        mouseHover(featuredCreatorImagesButton);
        click(featuredCreatorImagesButton);
    }

    public List<Integer> alphaCodersNetworkLinks(String requestMethod) throws IOException {

        List<SelenideElement> links = getElements(networkLinks);

        List<Integer> codes = new ArrayList<>();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
            connection.setRequestMethod(requestMethod);
            connection.connect();

            int responseCode = connection.getResponseCode();
            codes.add(responseCode);
        }
        return codes;
    }

    public List<Integer> popularContentLinks(String requestMethod) throws IOException {

        List<SelenideElement> links = getElements(popularContentLinks);

        List<Integer> codes = new ArrayList<>();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
            connection.setRequestMethod(requestMethod);
            connection.connect();

            int responseCode = connection.getResponseCode();
            codes.add(responseCode);
        }
        return codes;
    }

    public List<Integer> popularFanClubsLinks(String requestMethod) throws IOException {

        List<SelenideElement> links = getElements(fanClubsLinks);

        List<Integer> codes = new ArrayList<>();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
            connection.setRequestMethod(requestMethod);
            connection.connect();

            int responseCode = connection.getResponseCode();
            codes.add(responseCode);
        }
        return codes;
    }

    public void toFooterScroll(){
        mouseHover(footer);
    }

    public void toPopularContentScroll(){
        mouseHover(popularContent);
    }

    public void toPopularFanClubsScroll(){
        mouseHover(popularFanClubs);
    }
}