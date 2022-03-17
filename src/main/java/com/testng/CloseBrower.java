package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CloseBrower {

    @Test
    public void closeChrome() throws InterruptedException {
        //设置系统变量,并设置chromedriver的路径为系统属性值
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        //实例化ChromeDriver(打开浏览器)
        WebDriver driver = new ChromeDriver();
        //等待5s
        Thread.sleep(5000);
        //关闭浏览器（进程中Driver仍在）
        //driver.close();
        //完全关闭
        driver.quit();
    }

































}
