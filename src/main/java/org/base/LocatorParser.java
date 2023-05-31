package org.base;

import org.openqa.selenium.By;
public class LocatorParser {
    protected static By parseLocator(By by, Object... args) {
        String locatorFormat = locatorPattern(by.toString(), args);
        String locatorType = getLocatorTypeName(by);

        switch (locatorType) {
            case "ByCssSelector":
                return By.cssSelector(locatorFormat);
            case "ById":
                return By.id(locatorFormat);
            case "ByName":
                return By.name(locatorFormat);
            case "ByClassName":
                return By.className(locatorFormat);
            case "ByTagName":
                return By.tagName(locatorFormat);
            default:
                return By.xpath(locatorFormat);

        }
    }

    private static String locatorPattern(String str, Object... args) {
        return String.format(str.replaceAll("By\\.[^:]*:", "").trim(), args);
    }

    private static String getLocatorTypeName(By by) {
        return by.getClass().getSimpleName();
    }
}
