package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver webDriver){
        this.driver=webDriver;
    }

    private By emailIdFld=By.xpath("//input[@id='admin_user_email']");
    private By passwordFld=By.xpath("//input[@id='admin_user_password']");
    private By logInBtn=By.xpath("//input[@name='commit']");
    public String getTitle(){
        return driver.getTitle();
    }

    public void enterEmailID(String emailID){
        driver.findElement(emailIdFld).sendKeys(emailID);
    }

    public void enterPassword(String password){
        driver.findElement(passwordFld).sendKeys(password);
    }

    public void hitLogInBtn(){
        driver.findElement(logInBtn).click();
    }

    public void doLogIn(String username, String password){
        enterEmailID(username);
        enterPassword(password);
        hitLogInBtn();
    }

}
