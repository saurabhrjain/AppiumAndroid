package org.example.cowin.MobileApp;


import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
        //cap.setCapability("noReset","true");
       // cap.setCapability("fullReset","false");
        cap.setCapability("appPackage","in.gov.umang.negd.g2c");
        cap.setCapability("appActivity", "in.gov.umang.negd.g2c.ui.base.splash_screen.SplashActivity");
        //cap.setCapability("appPackage","in.redbus.android");
       // cap.setCapability("appActivity", "in.redbus.android.deeplink.DeeplinkDispatchActivity");
       // cap.setCapability("noReset","true");
        //cap.setCapability("fullReset","false");
       // cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability("autoAcceptAlerts", "true");
        Thread.sleep(10000);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
       // driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //drive.quit();
        Thread.sleep(2000);

        driver.findElementById("in.gov.umang.negd.g2c:id/cb_i_agree").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/custom_button").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/sliderImage").click();

        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Mobile Number']").sendKeys("7620997555");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter your MPIN']").sendKeys("7775");
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();


        //in.gov.umang.negd.g2c:id/custom_button
        Thread.sleep(1000);
        //driver.findElementById("net.one97.paytm:id/search_action_bar").sendKeys("Bus");
       // Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.TextView[@text='Quick Book']").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/filter18").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/filterFree").click();
        System.out.println(driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[2]").getText());



        WebElement li = driver.findElementByXPath("");
        Thread.sleep(1000);
       // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bus Tickets\"));");

    }

}
