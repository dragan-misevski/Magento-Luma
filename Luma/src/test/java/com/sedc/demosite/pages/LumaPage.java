package com.sedc.demosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;

public class LumaPage {

    By clickSignIn = By.className("authorization-link");
    By clickEmailField = By.id("email");
    By writeEmail = By.id("email");
    By clickPasswordField = By.id("pass");
    By writePassword = By.id("pass");
    By submitSignIn = By.id("send2");
    By clickClothing = By.xpath("//span[.='Clothing']");
    By funnyT_shirt = By.xpath("//a[contains(.,'Funny T-Shirt-Siva')]");
    By clickBucket = By.xpath("//div[@data-block='minicart']");
    By deleteAllItems = By.xpath("//a[@title='Remove item']");
    By clickOk = By.xpath("//button[@class='action-primary action-accept']");
    By clickChekOut = By.id("top-cart-btn-checkout");
    By clickPlaceOrder = By.xpath("//button[@title='Place Order']");


    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public LumaPage(WebDriver driver, WebDriverWait wait, Actions actions)
    {
        this.driver = driver;
        this.wait = wait;
        this.actions = actions;


    }

    public LumaPage(WebDriver driver){
        this.driver= driver;
    }

    public void navigateTo(String url){
        driver.get(url);
    }

    public void verifyByHomePage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home page";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void clickOnSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(clickSignIn)).click();
    }

    public void verifyByCustomerLogin(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Customer Login";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void clickOnEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(clickEmailField)).click();
    }
    public void writeYourEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(writeEmail)).sendKeys("ztmen_k1@hotmail.com");
    }
    public void clickOnPasswordField(){
        wait.until(ExpectedConditions.elementToBeClickable(clickPasswordField)).click();
    }
    public void writeYourPassword(){
        wait.until(ExpectedConditions.elementToBeClickable(writePassword)).sendKeys("user@123");
    }
    public void clickOnSubmitSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(submitSignIn)).click();
    }
    public void clickOnClothing(){
        wait.until(ExpectedConditions.elementToBeClickable(clickClothing)).click();
    }

    public void verifyByClothing(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Clothing";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void scrollPageToFunnyT_Shirt(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",funnyT_shirt);
    }
    public void clickOnFunnyT_shirt(){
        wait.until(ExpectedConditions.elementToBeClickable(funnyT_shirt)).click();
    }


    public void verifyByFannyTshirtTittle(){
        String TshirtTittle = "Funny T-Shirt-Siva";
        String TittleFromWebPage = driver.findElement(By.xpath("//span[.='Funny T-Shirt-Siva']")).getText();
        Assert.assertEquals(TshirtTittle,TittleFromWebPage);
    }

    public void verifyByInStock(){
        String InStockTittle = "IN STOCK";
        String TittleInStockWebPage = driver.findElement(By.xpath("//span[.='In stock']")).getText();
        Assert.assertEquals(InStockTittle,TittleInStockWebPage);
    }
    public void clickOnAddToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button"))).click();
    }
    public void verifyByOrangeSquare(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='counter-number'][contains(.,'1')]")));
    }

    public void clickOnBucket(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickBucket)).click();
    }

    public void verifyByPopUp(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("top-cart-btn-checkout")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='minicart-content-wrapper']//span[@class='price-wrapper'][.='$17.99']")));
    }

    public void clickOnCheckOut(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickChekOut)).click();
    }


    public void verifyByTshirtSiva(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[.='Funny T-Shirt-Siva']")));
    }

    public void clickOnPlaceOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(clickPlaceOrder)).click();
    }

    public void verifyByOrderNumber(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='order-number']")));
    }




    public void clickByDeleteItems(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteAllItems)).click();
    }

    public void clickByOk(){
        wait.until(ExpectedConditions.elementToBeClickable(clickOk)).click();
    }

}
