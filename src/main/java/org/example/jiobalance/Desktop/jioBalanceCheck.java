package org.example.jiobalance.Desktop;

import org.example.busticket.Desktop.isPresent;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class jioBalanceCheck extends driverDesktop {

    @Test
    public void homePageNavigation() throws IOException, InterruptedException {
        driver=initializeDriver();

        driver.get("https://jio.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"SignIn\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[1]/button[1]/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[2]/div/div[2]/div/div/input")).sendKeys("9922266136");
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[3]/button")).click();
        //Thread.sleep(60000);
        String otp =getOTP.getOtp();
        System.out.println(otp);
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[2]/div/div[1]/input[1]")).sendKeys(otp);
     driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[3]/button")).click();
        System.out.println("Plan Expires on:");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"dataVoicePlanContentWithNoDetails\"]/div[1]/div/span[2]")).getText());
        System.out.println("Your Current Plan and Plan Amount is:");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"dataVoicePlanContentWithNoDetails\"]/div[1]/div/span[1]")).getText());

    }



}
