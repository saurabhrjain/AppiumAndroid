package org.example.busticket.MobileApp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import javax.lang.model.element.Name;
import javax.print.attribute.standard.Destination;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class runPaytmBus {

    public static void main (String args[]) throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long totalTime =0;

        Scanner sc= new Scanner(System.in);

        startTime = System.currentTimeMillis();
       AndroidDriver driver= driverBus.getDriver();


        System.out.println("Enter your Scource City: ");
        String source =sc.nextLine();
        System.out.println("Enter your Destination City: ");
        String Destination=sc.nextLine();
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Age: ");
        String age=sc.nextLine();
        System.out.println("Enter your emal Address: ");
        String email=sc.nextLine();
        System.out.println("Enter your Mobile No: ");
        String MobileNo=sc.nextLine();
        driver.findElementById("net.one97.paytm:id/searchIcon").click();
        Thread.sleep(1000);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Landing Page Load Time: " + totalTime + "milliseconds");
        driver.findElementById("net.one97.paytm:id/search_action_bar").sendKeys("Bus");
        Thread.sleep(1000);
        startTime = System.currentTimeMillis();
        driver.findElementByXPath("//android.widget.TextView[@text='Bus']").click();
        Thread.sleep(2000);
        driver.findElementById("net.one97.paytm.flight_dynamic:id/txt_tomorrow_date").click();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/source").click();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/city_search_source").clear();
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Bus Page Load Time: " + totalTime + " milliseconds");

        driver.findElementById("net.one97.paytm.flight_dynamic:id/city_search_source").sendKeys(source);
        Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.TextView[@text='"+source+"']").click();
       // driver.findElementByXPath("android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout").click();
        if(driver.findElementById("net.one97.paytm.flight_dynamic:id/source").isDisplayed()){
        driver.findElementById("net.one97.paytm.flight_dynamic:id/source").click();}
        driver.findElementById("net.one97.paytm.flight_dynamic:id/city_search_destination").clear();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/city_search_destination").sendKeys(Destination);
        Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.TextView[@text='"+Destination+"']").click();

        driver.findElementByXPath("//android.widget.Button[@text='Search Buses']").click();
        driver.findElementByXPath("//android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup").click();
            Thread.sleep(5000);
        startTime = System.currentTimeMillis();
        By el=By.xpath("//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]");
        System.out.println("Selected Travels:"+ driver.findElementById("net.one97.paytm.flight_dynamic:id/bus_seat_title_text").getText());
        String TravelsName=driver.findElementById("net.one97.paytm.flight_dynamic:id/bus_seat_title_text").getText();
        By fare =By.id("net.one97.paytm.flight_dynamic:id/txt_total_fare");
        String Price="";
              for(int i=1;i<16;i++){
            driver.findElementByXPath("//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout["+i+"]/android.widget.TextView").click();
            if(isPresent.isElementPresent(driver,fare)){
                System.out.println("Price of the Ticket is"+driver.findElementById("net.one97.paytm.flight_dynamic:id/txt_total_fare").getText());
                 Price=driver.findElementById("net.one97.paytm.flight_dynamic:id/txt_total_fare").getText();
                break;
            }
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Seat Select Load Time: " + totalTime + " milliseconds");
        startTime = System.currentTimeMillis();
              System.out.println("Selected Seat:"+driver.findElementById("net.one97.paytm.flight_dynamic:id/txt_selected_seats").getText());
              String seatNO=driver.findElementById("net.one97.paytm.flight_dynamic:id/txt_selected_seats").getText();
              driver.findElementById("net.one97.paytm.flight_dynamic:id/btn_proceed_root").click();
              driver.findElementByXPath("//android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView").click();
              driver.findElementByXPath("//android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView").click();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/btn_proceed").click();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/title_mr").click();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/passenger_name_input").sendKeys(name);
        driver.findElementById("net.one97.paytm.flight_dynamic:id/passenger_age_input").sendKeys(age);
        driver.findElementById("net.one97.paytm.flight_dynamic:id/traveller_mobile_edittext").clear();

        driver.findElementById("net.one97.paytm.flight_dynamic:id/traveller_mobile_edittext").sendKeys(MobileNo);
        driver.findElementById("net.one97.paytm.flight_dynamic:id/traveller_email_edittext").clear();
        driver.findElementById("net.one97.paytm.flight_dynamic:id/traveller_email_edittext").sendKeys(email);
     //   driver.findElementById("net.one97.paytm.flight_dynamic:id/proceed_btn").click();
        String details="Your Bus Booking Details are;"+"\n Bus Name: "+TravelsName +"\n Seat No: "+ seatNO +"\n Fare of the Bus"+Price;
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("User Details Load Time: " + totalTime + " milliseconds");
        sendMail.sendDeatils(details);


      }

}
