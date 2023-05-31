package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
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
    public void searchAlphaCoder(String coderName){
        $(By.xpath("//input[@placeholder='Search Alpha Coders']")).append(coderName);
        click(searchButton);
    }

    public List<Integer> getSocialLinksCodes(String requestMethod) throws IOException {

        ElementsCollection links = $$(By.xpath("//div[@class='list-group list-group-follow']//a"));

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
        $(By.xpath("//div[contains(@class, 'feature-artist')]")).scrollIntoView(true);
        $(By.xpath("//span[@class='feature-profile']//a[1]")).click();
    }

    public void goToCreatorsWalls() throws InterruptedException {
        $(By.xpath("//div[@class='feature-bottom']//a[contains(text(), 'Wallpapers')]")).scrollIntoView(true);

        $(By.xpath("//div[@class='feature-bottom']//a[contains(text(), 'Wallpapers')]")).click();
    }

    public String getFeaturedCreatorName(){
        String name = $(By.xpath("//span[@class='feature-profile']//a[1]")).text();
        return name;
    }

    public String getFeaturedCreatorNameInCreatorProfile(){
        String name = $(By.xpath("//h1[@class='title']")).text();
        return name;
    }

    public void goToCreatorsImages() throws InterruptedException {
        $(By.xpath("//div[@class='feature-bottom']//a[contains(text(), 'Images')]")).scrollIntoView(true);
        Thread.sleep(3000);
        $(By.xpath("//div[@class='feature-bottom']//a[contains(text(), 'Images')]")).click();
    }

    public List<Integer> alphaCodersNetworkLinks(String requestMethod) throws IOException {

        ElementsCollection links = $$(By.xpath("//div[@class='footer']//ul//li//a[contains(@href, '/')]"));

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

        ElementsCollection links = $$(By.xpath("//div[@id='popular_collections']//ul//li//a"));

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

        ElementsCollection links = $$(By.xpath("//div[@class='row-with-preview-container']//div[@class='content-info center']//a"));

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
        $(By.xpath("//div[@class='footer']")).hover();
    }

    public void toPopularContentScroll(){
        $(By.xpath("//h1[contains(text(), 'Popular Content')]")).hover();
    }

    public void toPopularFanClubsScroll(){
        $(By.xpath("//h1[contains(text(), 'Popular Fan Clubs')]")).hover();
    }
}