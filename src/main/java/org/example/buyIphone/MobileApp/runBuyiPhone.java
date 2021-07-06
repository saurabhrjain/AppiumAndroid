
package org.example.buyIphone.MobileApp;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class runBuyiPhone {
    public static void main (String args[]) throws MalformedURLException, InterruptedException {

       AndroidDriver driver= driverIphone.getDriver();

        driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").clear();
        driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").click();
        Thread.sleep(2000);
        driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("iPhone 12 mini (64GB) Purple");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        driver.findElementByXPath("//android.view.View[contains(@content-desc, 'Apple iPhone 12 Mini (64GB)')]").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"buyNowCheckout\"));").click();
        //Add for fetch device details remaining.
    }

}
