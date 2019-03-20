package com.pageobject.skeleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseTest extends ConciseAPI {

    static WebDriver driver;

    static {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

//    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    @AfterClass
    public static void quit() {
        driver.quit();
    }
}
