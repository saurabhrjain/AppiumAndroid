package org.example.busticket.Desktop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class runBusTicket extends driverDesktop{

    @Test
    public void homePageNavigation() throws IOException, InterruptedException {
        driver=initializeDriver();

        driver.get("https://paytm.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[5]/div[2]/div/div/div[1]/div[4]/div/a")).click();
        driver.findElement(By.xpath("//div[2]/div[1]/span/div/input")).sendKeys("Pune");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div/p[1]")).click();
        driver.findElement(By.xpath("//div[4]/div[1]/span/div/input")).sendKeys("Jalgaon");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[4]/div[1]/div/div/div/div[2]/div/p[1]/b")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Search")).click();
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[6]/button")).click();
        JavascriptExecutor je = (JavascriptExecutor) driver;



//Identify the WebElement which will appear after scrolling down

        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/ul/li[5]/a"));

        je.executeScript("arguments[0].scrollIntoView({behavior: \"smooth\", block: \"center\", inline: \"nearest\"})", element);
        je.executeScript("arguments[0].scrollIntoView(true);",element);

        for (int i=1;i<6;i++){
            By Ele =By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[2]/div/div[4]/div[3]/div[1]");
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div["+i+"]")).click();
            if(isPresent.isElementPresent(driver,Ele)){
                break;
            }
        }
     driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[2]/div/div[1]/div/div/div/span")).click();
 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[2]/div/div[1]/div/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[2]/div/div[3]/div/div/div/span")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[2]/div/div[3]/div/ul/li[2]")).click();
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[3]/div/div/div/span/div/div[3]/div[2]/div/div[7]/button")).click();
       // je.executeScript("arguments[0].scrollIntoView({behavior: \"Smooth\" , block: \"center\", inline: \"nearest\"}))", element);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]")).click();
        Thread.sleep(13000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div/input")).click();
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div/input")).sendKeys("Saurabh Jain");
driver.findElement(By.xpath("//input[@type='number']")).sendKeys("25");
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/input")).sendKeys("Saurabh.jain1@amdocs.com");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/input")).sendKeys("7438764334");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[4]/div[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[1]/div[3]/span")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div[3]/span")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[4]/div[3]/text()[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div[2]/div/div[3]/span/text()")).getText());
    //    System.out.println(driver.findElement(By.xpath()));
    }



}
