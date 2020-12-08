package com.sedc.demosite.tests;

import com.sedc.demosite.pages.LumaPage;
import com.sedc.demosite.util.Global;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LumaPageTest extends Global {
    String url = "http://138.201.197.35:81/magento1";
    String name = "Dragan";
    String email = "dragan.misevski@yahoo.com";
    String currentAddress = "adass/s";
    String permanentAddress = "aksjdhaskj";
    String invalidEmail = "dragan.misevski@yahoo.com";


    @Test
    public void test1() throws InterruptedException {
        navigateTo(url);
        lumaPageTest.verifyByHomePage();
        lumaPageTest.clickOnSignIn();
        lumaPageTest.verifyByCustomerLogin();
        lumaPageTest.clickOnEmailField();
        lumaPageTest.writeYourEmail();
        lumaPageTest.clickOnPasswordField();
        lumaPageTest.writeYourPassword();
        lumaPageTest.clickOnSubmitSignIn();
        lumaPageTest.verifyByHomePage();
        lumaPageTest.clickOnClothing();
        lumaPageTest.verifyByClothing();
      //lumaPageTest.scrollPageToFunnyT_Shirt();
        lumaPageTest.clickOnFunnyT_shirt();
        lumaPageTest.verifyByFannyTshirtTittle();
        lumaPageTest.verifyByInStock();
        lumaPageTest.clickOnAddToCart();
        lumaPageTest.verifyByOrangeSquare();

        lumaPageTest.clickOnBucket();
        lumaPageTest.verifyByPopUp();
        lumaPageTest.clickOnCheckOut();
        lumaPageTest.verifyByTshirtSiva();
        TimeUnit.SECONDS.sleep(10);
        lumaPageTest.clickOnPlaceOrder();
        lumaPageTest.verifyByOrderNumber();

       // lumaPageTest.clickByDeleteItems();
       // lumaPageTest.clickByOk();
       // TimeUnit.SECONDS.sleep(10);
       // driver.navigate().refresh();

        TimeUnit.SECONDS.sleep(10);
    }

}
