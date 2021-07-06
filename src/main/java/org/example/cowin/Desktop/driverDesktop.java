package org.example.cowin.Desktop;


import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class driverDesktop {
    public WebDriver driver;


    public WebDriver initializeDriver() throws IOException {


        Properties prop =new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\jaisaura.NTNET\\IdeaProjects\\Project\\src\\main\\java\\resources\\data.properties");
        prop.load(fis);
        String browserName= prop.getProperty("browser");



        if(browserName.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaisaura.NTNET\\Downloads\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.setAcceptInsecureCerts(true);
            options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("noReset","true");
            cap.setCapability("fullReset","false");
            driver= new ChromeDriver(options);


        }
        else if(browserName=="firefox"){

        }
        else if (browserName=="IE"){

        }

        //driver.manage().timeouts().implicitlyWait(S);
        return driver;

    }
}
