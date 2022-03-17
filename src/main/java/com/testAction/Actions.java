package com.testAction;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions {

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
    public void checkTest() throws InterruptedException {
        driver.get("https://www.baidu.com");
        WebElement text = driver.findElement(By.xpath(".//*[@id='kw']"));
        text.sendKeys("selenium");
        WebElement buttum = driver.findElement(By.xpath(".//*[@id='su']"));
        buttum.click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"selenium_百度搜索","实际结果与预期结果不一致！");
        Thread.sleep(2000);
    }


    //判断百度的按钮显示的文本是否未  百度一下
    @Test
    public void getButtomValueTest(){
        driver.get("https:www.baidu.com");
        WebElement buttom = driver.findElement(By.xpath(".//*[@id='su']"));
        Assert.assertEquals(buttom.getAttribute("value"),"百度一下","与预期结果一致！");
    }




    //判断百度首页是否展示百度一下按钮
    @Test
    public void isDisplayTest(){
        driver.get("https://www.baidu.com");
        boolean displayed = driver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(displayed,"校验百度一下按钮是否展示");
    }




    //判断选择框是否被选中
    //http://localhost:63342/Selenium/selenium_html/index.html?_ijt=thun80r1b4c3erm86br60k12m2&_ij_reload=RELOAD_ON_SAVE
    @Test
    public void isSlected() throws InterruptedException {
        driver.get("http://localhost:63342/Selenium/selenium_html/index.html");
        WebElement radio = driver.findElement(By.xpath(".//*[@id='radio']/input[1]"));
        Thread.sleep(2000);
        radio.click();
        Thread.sleep(3000);
        boolean selected = radio.isSelected();
        Assert.assertTrue(selected);
    }






















}
