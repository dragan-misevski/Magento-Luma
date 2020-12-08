package com.sedc.demosite.tests;

import com.sedc.demosite.pages.PracticeFormPage;
import com.sedc.demosite.util.Global;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PracticeFormPageTest extends Global {

    String url = "https://demoqa.com/elements";

    @Test
    public void test1() throws InterruptedException {

        navigateTo(url);
        /*driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]/span")).click();
        TimeUnit.SECONDS.sleep(2);
        practiceFormPage.clickOnForm();
        TimeUnit.SECONDS.sleep(2);
        practiceFormPage.clickOnPracticeForm();
        TimeUnit.SECONDS.sleep(2);
        practiceFormPage.clickOnPracticeForm();
        practiceFormPage.pisisime();
        practiceFormPage.pisisprezime();
        practiceFormPage.clickOnUserEmail();
        practiceFormPage.pisiEmail();
        practiceFormPage.clickOnRadioButtonMale();
        */





        TimeUnit.SECONDS.sleep(5);


    }

}
