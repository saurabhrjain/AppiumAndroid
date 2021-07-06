package org.example.cowin.MobileApp;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class runCowin {
    public static void main (String args[]) throws MalformedURLException, InterruptedException {

       AndroidDriver driver=driverCowin.getDriver();
/*
        driver.findElementById("in.gov.umang.negd.g2c:id/cb_i_agree").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/custom_button").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/sliderImage").click();

        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Mobile Number']").sendKeys("2871281212");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter your MPIN']").sendKeys("1234");
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        Thread.sleep(1000);
        */
        //driver.findElementById("net.one97.paytm:id/search_action_bar").sendKeys("Bus");
        // Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.TextView[@text='Quick Book']").click();
      //  driver.findElementById("in.gov.umang.negd.g2c:id/filter18").click();
        //driver.findElementById("in.gov.umang.negd.g2c:id/filterFree").click();

        driver.findElementById("in.gov.umang.negd.g2c:id/centerNameTxt").click();
        driver.findElementById("in.gov.umang.negd.g2c:id/txt_custom_edit_text").clear();


        driver.findElementByXPath("//android.widget.TextView[@text='Search By District']").click();

        String state =driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.TextView").getText();
        if(!state.equals("Maharashtra")){
            scrollDown.SwipeUp(driver);
            driver.findElementById("in.gov.umang.negd.g2c:id/llStateLay").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Maharashtra\"));").click();
        }

        String city =driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView").getText();
        if(city!="Pune"){
            driver.findElementById("in.gov.umang.negd.g2c:id/llCityLay").click();
            scrollDown.SwipeUp(driver);

//            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pune\"));");
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Pune\"));").click();
        }
        driver.findElementById("in.gov.umang.negd.g2c:id/custom_button").click();

        //driver.findElementById("in.gov.umang.negd.g2c:id/txt_custom_edit_text").sendKeys("411028");
        //driver.findElementById("in.gov.umang.negd.g2c:id/custom_button").click();
        //driver.findElementById("in.gov.umang.negd.g2c:id/filter18").click();
        boolean flag=true;
        int i=0;
        while (flag==true) {
            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
                System.out.println(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"in.gov.umang.negd.g2c:id/centerName\").instance(" + i + "));").getText());
                i++;

            } catch (org.openqa.selenium.NoSuchElementException e) {
                flag = false;
            } finally {
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        }
        System.out.println(i);
        //driver.findElementById("in.gov.umang.negd.g2c:id/filterFree").click();

       // System.out.println(driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[2]").getText());
     /*   int i=1;
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView();");
        boolean flag=false;
        //System.out.println(driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat["+i+"]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]").isDisplayed());
        while(flag==false){

            if(driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat["+i+"]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]").isDisplayed()==false) {
                scrollDown.scroll(driver);

            }

            System.out.println(driver.findElementByXPath("//androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat["+i+"]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]").getText());
            i++;

        }

*/

    }

}
