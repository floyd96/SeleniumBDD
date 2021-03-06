package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;
    private int listSize;

    public ProductPage(WebDriver webDriver){
        this.driver=webDriver;
    }
    private By newProduct=By.xpath("//a[normalize-space()='New Product']");
    private By titleBox=By.xpath("//input[@id='product_title']");
    private By skuBox=By.xpath("//input[@id='product_sku']");
    private By descBox=By.xpath("//input[@id='product_description']");
    private By createBtn=By.xpath("//input[@name='commit']");
    private By successMsg=By.xpath("//div[@class='flash flash_notice']");
    private By errorMsg=By.xpath("//p[contains(text(),'has already been taken')]");
    private By productList=By.xpath("//tbody//tr");
    private By deleteBtn=By.xpath("//tr[@class='odd']//a[@title='Delete'][normalize-space()='Delete']");



    public void enterTitle(String title){
        driver.findElement(titleBox).sendKeys(title);
    }
    public void enterSKU(String SKU){
        driver.findElement(skuBox).sendKeys(SKU);
    }
    public void enterDesc(String desc){
        driver.findElement(descBox).sendKeys(desc);
    }
    public void clickCreateBtn(){
        driver.findElement(createBtn).click();
    }
    public boolean isSuccessDisplayed(){
        return driver.findElement(successMsg).isDisplayed();
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public void clickNewProduct(){
        driver.findElement(newProduct).click();
    }
    public boolean isErrorMsgDisplayed(){
        return driver.findElement(errorMsg).isDisplayed();
    }
    public int getProductListSize(){
        return driver.findElements(productList).size();
    }
    public void clickDeleteBtn(){
        driver.findElement(deleteBtn).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
