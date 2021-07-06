package org.example;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class base
{
    /**
     * Rigorous Test :-)
     */
    public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException, InterruptedException {
      /*  File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");
        */System.out.println("Hello World!");

        DesiredCapabilities cap = new DesiredCapabilities();
        if (device.equals("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NexusDemo");
        }else if(device.equals("real")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        cap.setCapability("app-package","");
        cap.setCapability("app-activity", "in.redbus.android.deeplink.DeeplinkDispatchActivity");
       // cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
       // driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        //Thread.sleep(10000);
        //drive.quit();
return driver;
    }

}
