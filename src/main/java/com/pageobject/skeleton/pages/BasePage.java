package com.pageobject.skeleton.pages;

import com.pageobject.skeleton.api.ConciseAPI;
import org.openqa.selenium.WebDriver;

public class BasePage extends ConciseAPI {
    public WebDriver getWebDriver() {
        return driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver driver;
}
