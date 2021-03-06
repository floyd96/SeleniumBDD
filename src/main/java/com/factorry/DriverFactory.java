package com.factorry;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {


    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();


    public static WebDriver init_driver(){
        WebDriverManager.chromedriver().setup();
        //WebDriver chromeDriver=new ChromeDriver();
        tlDriver.set(new ChromeDriver());

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);


        return getDriver();
    }
    public static WebDriver getDriver(){
        /*WebDriver driver=init_driver();
        return driver;*/
        return tlDriver.get();


    }
}
