package org.example.buyIphone.Desktop;

import org.example.busticket.Desktop.driverDesktop;
import org.example.busticket.Desktop.isPresent;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class runIphone extends driverDesktop {

    @Test
    public void homePageNavigation() throws IOException, InterruptedException {
        driver=initializeDriver();
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long totalTime =0;
        startTime = System.currentTimeMillis();
        driver.get("https://amazon.in/");
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Home Page Load Time: " + totalTime + " milliseconds");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("New Apple iPhone 12 (64GB) - Purple");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Iphone Search  Time: " + totalTime + " milliseconds");
        startTime = System.currentTimeMillis();
        int i=1;
        boolean flag =false;
        while(flag!=true) {

          if( driver.findElement(By.xpath("//div[2]/div["+i+"]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).getText().equals("New Apple iPhone 12 (64GB) - Purple"));
            {
                driver.findElement(By.xpath("//div[2]/div["+i+"]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
            flag=true;

            }
            i++;
        }
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]")).click();
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Bus Page Load Time: " + totalTime + " milliseconds");
        startTime = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("XYZ123");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a")).click();
        driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")).click();
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Login Page Load Time: " + totalTime + " milliseconds");
        }



}
