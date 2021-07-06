package org.example.busticket.Desktop;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class isPresent {
    public static boolean isElementPresent(WebDriver driver, By el) {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
            driver.findElement(el);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }finally {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
}
