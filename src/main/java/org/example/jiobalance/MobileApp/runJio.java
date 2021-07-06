package org.example.jiobalance.MobileApp;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class runJio {
    public static void main (String args[]) throws MalformedURLException, InterruptedException {

       AndroidDriver driver= driverJio.getDriver();


        driver.findElementByXPath("//android.widget.EditText[@text='Enter mobile number']").sendKeys("43643434343");

        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        Thread.sleep(1000);
      //  driver.openNotifications();

        //driver.findElementById("net.one97.paytm:id/search_action_bar").sendKeys("Bus");
        // Thread.sleep(1000);
        //
        Thread.sleep(3000);
        if(driver.findElementByXPath("//android.widget.Button[@text='Allow']").isDisplayed()){
            driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();}        //driver.openNotifications();

        driver.findElementByXPath("//android.widget.Button[@text='Proceed']").click();
        driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
        if(driver.findElementByXPath("//android.widget.Button[@text='Allow']").isDisplayed()){
        driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();}
        //driver.findElementById("com.jio.myjio:id/iv_close_permission_dialog").click();
        driver.findElementById("com.jio.myjio:id/layout_home_screen").click();
        System.out.println(driver.findElementById("com.jio.myjio:id/tv_plan_expiry").getText());
       driver.findElementById("com.jio.myjio:id/tv_plan_expiry").click();
        System.out.println(driver.findElementByXPath("//android.view.View[contains(@text, 'Jul 10')]/../android.view.View[1]").getText());



    }

}
