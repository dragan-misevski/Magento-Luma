package com.sedc.demosite.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InteractionsPage {

    By clickSortable = By.xpath("//span[.='Sortable']");
    By clickSelectTable = By.xpath("//span[.='Selectable']");
    By selectCras = By.xpath("//li[.='Cras justo odio']");
    By clickResizable = By.xpath("//span[.='Resizable']");
    By clickDroppable = By.xpath("//span[.='Droppable']");
    By clickDraggable = By.xpath("//span[.='Dragabble']");



    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public InteractionsPage(WebDriver driver, WebDriverWait wait,Actions actions) {
        this.driver = driver;
        this.wait = wait;
        this.actions = actions;

    }



    public void navigateTo(String url) {
        driver.get(url);
    }

    public void scrollPageInteractions(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickOnSortable() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSortable)).click();
    }

    public void dragAndDrop(){

        WebElement From=driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));

        WebElement To=driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]"));

        actions.dragAndDrop(From, To).build().perform();
    }

    public void clickOnSelectable(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSelectTable)).click();
    }
    public void selectOnCras(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCras)).click();
    }

    public void clickOnResizable(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(clickResizable)).click();
    }

    public void resizable(){
       // driver.switchTo().frame(0);

        WebElement slideElement = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));


        actions.dragAndDropBy(slideElement, 150, 150).perform();

        System.out.println("Done Resizing");
    }
    public void clickOnDroppable(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(clickDroppable)).click();
    }

    public void drag(){

        WebElement From=driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement To=driver.findElement(By.id("droppable"));

        actions.dragAndDrop(From, To).build().perform();
    }
    public void verifyByDropped(){
        String Dropped = "Dropped!";
        String TittleInDropped = driver.findElement(By.xpath("//div[.='Dropped!']")).getText();
        Assert.assertEquals(Dropped,TittleInDropped);
    }
    public void clickOnDraggable(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(clickDraggable)).click();
    }

    public void dragMe(){

        WebElement From=driver.findElement(By.id("dragBox"));
        actions.dragAndDropBy(From, 150, 150).perform();

    }
}
