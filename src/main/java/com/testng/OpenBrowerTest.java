package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenBrowerTest {

    @Test
    public void OpenChrome(){
//        设置系统变量,并设置chromedriver的路径为系统属性值
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        实例化ChromeDriver(打开浏览器)
        WebDriver driver = new ChromeDriver();
    }



    @Test
    public void OpenIE(){
//        设置系统变量,并设置chromedriver的路径为系统属性值
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\IEDriverServer.exe");
//        实例化ChromeDriver(打开浏览器)
        WebDriver driver = new InternetExplorerDriver();
    }


    @Test
    public void OpenEDGE(){
//        设置系统变量,并设置chromedriver的路径为系统属性值
        System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
//        实例化ChromeDriver(打开浏览器)
        WebDriver driver = new EdgeDriver();
    }




























}
