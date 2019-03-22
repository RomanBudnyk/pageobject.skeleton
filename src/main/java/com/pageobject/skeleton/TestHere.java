package com.pageobject.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHere extends BaseTest {

    @Test
    public void someTest() {
        driver.get("https://google.com/ncr");
        System.out.println("some");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("hi", Keys.ENTER);
    }
}
