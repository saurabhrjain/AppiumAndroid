package org.example.cowin.MobileApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class driverCowin {
    public static AndroidDriver<AndroidElement> getDriver() throws InterruptedException, MalformedURLException {
          System.out.println("Hello World!");

        DesiredCapabilities cap = new DesiredCapabilities();
       /* if (device.equals("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NexusDemo");
        }else if(device.equals("real")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }*/
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"redBus");
        //cap.setCapability("noReset","true");
        // cap.setCapability("fullReset","false");
        cap.setCapability("appPackage","in.gov.umang.negd.g2c");
        cap.setCapability("appActivity", "in.gov.umang.negd.g2c.ui.base.splash_screen.SplashActivity");
        //cap.setCapability("appPackage","in.redbus.android");
        // cap.setCapability("appActivity", "in.redbus.android.deeplink.DeeplinkDispatchActivity");
         cap.setCapability("noReset","true");
        cap.setCapability("fullReset","false");
        // cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability("autoAcceptAlerts", "true");
        Thread.sleep(10000);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
        // driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
