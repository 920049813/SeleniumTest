package com.testng;

import gherkin.lexer.Th;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class BrowserActionTest {

    @Test
    public void getTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(5000);
        driver.close();
    }



    @Test
    public void backTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }



    @Test
    public void winTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);
        //设置窗口大小
        Dimension dimension = new Dimension(500, 300);
        driver.manage().window().setSize(dimension);
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }


    @Test
    public void GetURLTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        //比较URL是否一致
        Assert.assertEquals(URL,"https://www.baidu.com/","URL不一致");
        Thread.sleep(2000);
        driver.close();
    }








}
