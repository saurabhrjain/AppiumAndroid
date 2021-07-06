package org.example.cowin.Desktop;

import org.example.busticket.MobileApp.sendMail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class cowinWeb extends driverDesktop {

    @Test
    public void homePageNavigation() throws Exception {
        driver=initializeDriver();

        driver.get("https://web.umang.gov.in/web_new/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
      //  Thread.sleep(5000);
     Actions action = new Actions(driver);
  /*      Thread.sleep(5000);
       WebElement element =  driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div/div[1]/a[8]"));
WebElement element1 =driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div/div[1]/a[8]/div/button[1]"));
        action.moveToElement(element).build().perform();


        //driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div/div[1]/a[8]/div/button[1]")).click();
        */

        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("999999999");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("1234");
        String captcha = "";
        for(int i=1;i<7;i++){


         captcha=captcha +  driver.findElement(By.xpath("/html/body/app-root/my-login-form/mat-card/mat-card-content/div/form/div[2]/div/div[1]/span["+i+"]")).getText();

        }
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys(captcha);
        driver.findElement(By.xpath("/html/body/app-root/my-login-form/mat-card/mat-card-content/div/form/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-appcontainer/div/mat-drawer-container/mat-drawer-content/app-home/div[1]/div/div[1]/div/app-home-data/div[3]/div[2]/ngx-slick-carousel/div/div/div/div/div[1]/div")).click();
        //Thread.sleep(4000);
        driver.switchTo().frame("myIframe");
        driver.findElement(By.xpath("/html/body/app-root/app-app-root/app-app-home/div/div[3]/ul/li[2]/app-app-tile/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("411028");
        driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/form/div[2]/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-book-instructions-popup/div/mat-dialog-actions/div/button")).click();
        //By ell  =By.xpath("//*[contains(text(),'Age 18+')]//preceding-sibling::div[@class='vaccine-name']//preceding-sibling::div");
            List<WebElement> elements= driver.findElements(By.xpath("//*[contains(text(),'Age 18+')]//preceding-sibling::div[@class='vaccine-name']//preceding-sibling::div"));
            List<WebElement> elements1=driver.findElements(By.xpath("//*[contains(text(),'Age 18+')]//preceding-sibling::div[@class='vaccine-name']"));
           List<WebElement> elements2= driver.findElements(By.xpath("//*[contains(text(),'Age 18+')]/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div/div/h3"));
        List<WebElement> elements3= driver.findElements(By.xpath("//*[contains(text(),'Age 18+')]/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div/div/div"));
        int slots=0;
        String vac="";
        String Center="";
        String Add="";
        for(int i=0;i<elements.size();i++){
                 slots=Integer.valueOf(elements.get(i).getText());
               if(slots>0){
                   System.out.println(slots);
                   System.out.println(elements1.get(i).getText());
                   vac=elements1.get(i).getText();
                   System.out.println(elements2.get(i).getText());
                   Center=elements2.get(i).getText();
                   System.out.println(elements3.get(i).getText());
                   Add=elements3.get(i).getText();
                                      break;

               }
            }
            String details="No Of Slots Available:" +slots+"\n Vaccine Name:" +vac+"\n Center Name: "+"\n Address:" +Add;
        sendMail.sendDeatils(details);
       //    System.out.println(driver.findElement(By.xpath()));
    }



}
