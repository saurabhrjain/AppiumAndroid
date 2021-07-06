package org.example;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class baseRedBus
{
    /**
     * Rigorous Test :-)
     */
    public static void main (String args[]) throws MalformedURLException, InterruptedException {
      /*  File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");
        */System.out.println("Hello World!");

        DesiredCapabilities cap = new DesiredCapabilities();
       /* if (device.equals("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NexusDemo");
        }else if(device.equals("real")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }*/
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"redBus");
        cap.setCapability("noReset","true");
        cap.setCapability("fullReset","false");
        cap.setCapability("appPackage","net.one97.paytm");
        cap.setCapability("appActivity", "net.one97.paytm.app.LauncherActivity");
        //cap.setCapability("appPackage","in.redbus.android");
       // cap.setCapability("appActivity", "in.redbus.android.deeplink.DeeplinkDispatchActivity");
        cap.setCapability("noReset","true");
        cap.setCapability("fullReset","false");
       // cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        Thread.sleep(10000);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
       // driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        //Thread.sleep(10000);
        //drive.quit();
        driver.findElementById("net.one97.paytm:id/searchIcon").click();
        Thread.sleep(1000);
        driver.findElementById("net.one97.paytm:id/search_action_bar").sendKeys("Bus");
        Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.TextView[@text='Bus']").click();
        Thread.sleep(1000);
       // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bus Tickets\"));");

    }

}
