package com.sedc.demosite.tests;

import com.sedc.demosite.pages.InteractionsPage;
import com.sedc.demosite.util.Global;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InteractionsPageTest extends Global {

    String url = "https://demoqa.com/interaction";

    @Test
    public void test1() throws InterruptedException {

    navigateTo(url);
    interactionsPage.scrollPageInteractions();
    TimeUnit.SECONDS.sleep(5);
    interactionsPage.clickOnSortable();
    interactionsPage.dragAndDrop();
    interactionsPage.scrollPageInteractions();
    interactionsPage.clickOnSelectable();
    interactionsPage.selectOnCras();
    interactionsPage.clickOnResizable();
    TimeUnit.SECONDS.sleep(5);
    interactionsPage.resizable();
    interactionsPage.scrollPageInteractions();
    interactionsPage.clickOnDroppable();
    interactionsPage.drag();
    interactionsPage.verifyByDropped();
    interactionsPage.scrollPageInteractions();
    interactionsPage.clickOnDraggable();
    interactionsPage.dragMe();




    TimeUnit.SECONDS.sleep(7);


    }

}
