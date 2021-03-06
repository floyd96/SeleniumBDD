package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver webDriver){
        this.driver=webDriver;
    }

    private By productBtn=By.xpath("//a[normalize-space()='Products']");

    public void clickProductBtn(){
        driver.findElement(productBtn).click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
