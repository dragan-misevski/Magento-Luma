package com.sedc.demosite.util;

import com.sedc.demosite.pages.InteractionsPage;
import com.sedc.demosite.pages.LumaPage;
import com.sedc.demosite.pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Global {


    public static final int TIMEOUT = 20;
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public LumaPage lumaPageTest;
    public PracticeFormPage practiceFormPage;
    public InteractionsPage interactionsPage;
    public void navigateTo(String url){
        driver.get(url);
    }


    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,TIMEOUT);
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        lumaPageTest = new LumaPage(driver,wait,actions);
        practiceFormPage = new PracticeFormPage(driver,wait);
        interactionsPage = new InteractionsPage(driver,wait,actions);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
