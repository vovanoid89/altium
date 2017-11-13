package com.altium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ServerLoginTest {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://ukrpc062.altium.biz:9780/Account/Login?ReturnUrl=%2f");
    }
    @Test
    public void login() {

        WebElement loginField = driver.findElement(By.id("UserName"));
        loginField.sendKeys("t1");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("t1");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[5]/div/button"));
        loginButton.click();

        WebElement loginCheck = driver.findElement(By.xpath("//*[@id=\"site-header\"]/div/div[2]/div[3]/div[1]/span[2]"));
        String user = loginCheck.getText();
        Assert.assertEquals("t1", user);
    }
    @AfterClass
    public static void end(){

        WebElement logMenu = driver.findElement(By.className("ico"));
       logMenu.click();

       WebElement logOut = driver.findElement(By.className("menu-item"));
       logOut.click();
       driver.quit();
    }
}

