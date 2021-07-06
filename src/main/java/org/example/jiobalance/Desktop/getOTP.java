package org.example.jiobalance.Desktop;

import io.appium.java_client.android.AndroidDriver;
import org.example.jiobalance.MobileApp.driverJio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import java.net.MalformedURLException;

public class getOTP {

    public static String getOtp() throws MalformedURLException, InterruptedException {
        AndroidDriver driver= driverMobile.getDriver();
        String  otp="";
        driver.openNotifications();
        if(driver.findElementById("android:id/message_name").getText().contains("JIONET")){
      otp =     driver.findElementById("android:id/message_text").getText();
       //     System.out.println(otp);
        }
        otp =     driver.findElementById("android:id/message_text").getText();
otp=otp.substring(16,22);
       // System.out.println(otp.length());
        driver.findElementById("com.android.systemui:id/clear_all").click();
        return otp;

    }
}
