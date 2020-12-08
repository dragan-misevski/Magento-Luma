package com.sedc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstSeleniumClass {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("http://google.com");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(2);
        driver.close();
    }

    @Test
    public void test2() throws InterruptedException {

        System.out.println("Test1");


        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("contact-link")).click();
        TimeUnit.SECONDS.sleep(2);

        driver.close();

    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("contact-link")).click();
        driver.findElement(By.name("search_query")).sendKeys("shirt");
        TimeUnit.SECONDS.sleep(2);

        driver.close();

    }

    @Test
    public void test4() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();
        if (driver.findElements(By.id("contact-link")).size() > 0)
            System.out.println("Elementot e najden");
        else {
            System.out.println("Elementot ne e najden");
        }

        // driver.findElement(By.id("contact-link")).click();
        driver.findElement(By.name("search_query")).sendKeys("shirt");
        driver.findElement(By.className("btn-default")).click();
        driver.findElement(By.tagName("a"));

      /*  List<WebElement> list=driver.findElements(By.tagName("a"));
        for(WebElement i: list){
            System.out.println(i.getAttribute("href"));
        }
      */
        // driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//div[@class='product-image-container']//img")).click();
        driver.findElement(By.xpath("//*[@id=\"group_1\"]")).click();
        driver.findElement(By.xpath("//*[@id='group_1']/option[.='L']")).click();
        //TimeUnit.SECONDS.sleep(15);
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        TimeUnit.SECONDS.sleep(35);

        driver.close();

    }

    @Test
    public void test5() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.linkText("Contact us")).getAttribute("href"));
        System.out.println(driver.findElement(By.linkText("Contact us")).getAttribute("Title"));
        // driver.findElement(By.linkText("Contact us")).click();
        // driver.findElement(By.partialLinkText("us")).click();
/*
        driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("dress");
        driver.findElement(By.cssSelector("input.search_query")).sendKeys("es");
       // driver.findElement(By.cssSelector("input[name=search_query]")).sendKeys("osos");
        //placeholder
        driver.findElement(By.cssSelector("input[placeholder=Search][name=search_query]")).sendKeys("AND ");
        driver.findElement(By.cssSelector("input[placeholder=Search],[name=search_query]")).sendKeys("OR ");
        driver.findElement(By.cssSelector("input.search_query[name=search_query]")).sendKeys(" Class and attribute");
        driver.findElement(By.cssSelector("input#search_query_top[name=search_query]")).sendKeys(" Id and attribute");
*/
        driver.findElement(By.cssSelector("input[id^=search]")).sendKeys(" ^^^^");
        driver.findElement(By.cssSelector("input[id$=top]")).sendKeys(" $$$$");
        driver.findElement(By.cssSelector("input[id*=rch]")).sendKeys(" ******");
        // driver.findElement(By.cssSelector("ul.sf-menu>li:nth-of-type(1)")).click();
        // TimeUnit.SECONDS.sleep(4);
        // driver.findElement(By.cssSelector("ul.sf-menu>li:nth-of-type(2)")).click();
        // TimeUnit.SECONDS.sleep(4);
        // driver.findElement(By.cssSelector("ul.sf-menu>li:nth-of-type(3)")).click();
        driver.findElement(By.cssSelector("ul.sf-menu>li:last-child")).click();

        TimeUnit.SECONDS.sleep(4);
    }

    @Test
    public void test6() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product&search_query=shirt&results=1");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("select.attribute_select option:nth-of-type(2)")).click();
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(By.cssSelector("select.attribute_select option:last-child")).click();
        TimeUnit.SECONDS.sleep(4);
    }

    @Test
    public void test7() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product&search_query=shirt&results=1");
        driver.manage().window().maximize();
        Select select = new Select(driver.findElement(By.className("attribute_select")));
        select.selectByIndex(2);
        TimeUnit.SECONDS.sleep(4);
    }

    @Test
    public void test8() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.className("search_query")).sendKeys("dress");
        driver.findElement(By.className("button-search")).click();
        List<WebElement> lista = driver.findElements(By.cssSelector("ul.product_list li"));
        System.out.println(lista.size());
        TimeUnit.SECONDS.sleep(4);
    }
    @Test
    public void test9() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
       //driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
      // driver.findElement(By.xpath("//input[contains(@class,'form-control ac_input')]")).sendKeys("dress");
        driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("dress");

        driver.findElement(By.xpath("//input[@class='search_query' or @id='search_query_top']")).sendKeys(" or shirt");
        driver.findElement(By.xpath("//input[contains(@class,'search_query') and @id='search_query_top']")).sendKeys(" and pants");
        driver.findElement(By.xpath("//input[starts-with(@id,'search') and @id='search_query_top']")).sendKeys("Starts with");
        //driver.findElement(By.xpath("//a[.='Contact us']")).click();
        //driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();
      //  driver.findElement(By.xpath("//*[text()='Contact us']")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText("Sign")).click();
        TimeUnit.SECONDS.sleep(4);


        WebDriverWait wait = new WebDriverWait(driver, 10);

    }

    @Test
    public void test10() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        By searchField = By.id("search_query_top");
        By search_btn = By.name("submit_search");
        By no_results = By.xpath("//p[@class='alert alert-warning']");
        By no_results_txt = By.xpath("//p[contains(.,'No results were found for your search')]");

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys("pants");
        wait.until(ExpectedConditions.visibilityOfElementLocated(search_btn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(no_results)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(no_results_txt)).isDisplayed();

        TimeUnit.SECONDS.sleep(4);

        Wait wait1 = new FluentWait(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(200,TimeUnit.MICROSECONDS);

    }
    @Test
    public void test11() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("pass");

    }
}
