package org.example.cowin.MobileApp;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class scrollDown {

    public static void scroll(AndroidDriver driver) {
        Dimension dim = driver.manage().window().getSize();
        int scrollStart = (int) (dim.getHeight() * 0.60);
        int scrollEnd = (int) (dim.getHeight() * 0.10);

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();

    }

    public  static void SwipeUp(AndroidDriver driver){
       Dimension  dim = driver.manage().window().getSize();
       // System.out.println(size);
        int startY = (int) (dim.getHeight() * 0.80);
        int startX = (int) (dim.getWidth() * 0.50);
        int endX = (int) (dim.getWidth() * 0.20);

        int endY = (int) (dim.getHeight() * 0.20);

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endX, endY))
                .release().perform();
      //  driver.swipe(startx, startY, startx, endy, timeduration);
    }
}
