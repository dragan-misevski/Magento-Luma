package com.sedc.demosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage {

    By clickForm = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]/div[2]");
    By practiceForm = By.xpath("//div[@class='accordion']//div[@class='element-list collapse show']");
    By firstName = By.xpath("//*[@id=\"firstName\"]");
    By writeFirstName = By.xpath("//*[@id=\"firstName\"]");
    By lastName = By.xpath("//*[@id=\"lastName\"]");
    By writeLastName = By.xpath("//*[@id=\"lastName\"]");
    By userEmail = By.xpath("//*[@id=\"userEmail\"]");
    By writeUserEmail = By.xpath("//*[@id=\"userEmail\"]");
    By radioButtonMale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");

    //Interactions
    By clickInteractions = By.xpath("//span[contains(.,'Interactions')]");





    private WebDriver driver;
    private WebDriverWait wait;

    public PracticeFormPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clickOnForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickForm)).click();
    }

    public void clickOnPracticeForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(practiceForm)).click();
    }

    public void taaetaa(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.accordion>div:nth-of-type(2) ul.menu-list>li#item-0"))).click();
    }

    public void clickOnFirstName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).click();
    }

    public void pisisime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(writeFirstName)).sendKeys("Dragan");
    }

    public void clickOnLastName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).click();
    }

    public void pisisprezime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(writeLastName)).sendKeys("Misevski");
    }

    public void clickOnUserEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userEmail)).click();
    }

    public void pisiEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(writeUserEmail)).sendKeys("ztmen.misevski@gmail.com");

    }
    public void clickOnRadioButtonMale() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(radioButtonMale)).click();
    }

    public void clickOnInteractions() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickInteractions)).click();
    }


}