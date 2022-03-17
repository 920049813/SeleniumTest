package com.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElement {

    WebDriver driver;


    @BeforeTest
    public void openChrome(){
        //设置系统变量,并设置chromedriver的路径为系统属性值
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        //实例化ChromeDriver(打开浏览器)
        driver = new ChromeDriver();
    }


    @AfterTest
    public void close(){
        driver.close();
    }




    @Test
    public void baiDuTest() throws InterruptedException {
        driver.get("https:www.baidu.com");
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.xpath(".//*[@id='kw']"));
        text.sendKeys("百度一下");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath(".//*[@id='su']"));
        button.click();
        Thread.sleep(2000);

    }




    @Test
    public void testClear() throws InterruptedException {
        driver.get("https:www.baidu.com");
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.xpath(".//*[@id='kw']"));
        text.sendKeys("百度一下");
        Thread.sleep(2000);
        text.clear();
        Thread.sleep(2000);

    }








}
