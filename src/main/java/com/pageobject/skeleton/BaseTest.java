package com.pageobject.skeleton;

import com.pageobject.skeleton.api.ConciseAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest extends ConciseAPI {

    static WebDriver driver;

//    static {
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//    }

    @Parameters("browser")
    @BeforeTest
    public void setup(@Optional ("edge") String browser) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new Exception("Browser is not correct");
        }
        driver.get("https://google.com/ncr");

    }

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    @AfterClass
    public static void quit() {
        if (driver != null)
            driver.quit();
    }
}
