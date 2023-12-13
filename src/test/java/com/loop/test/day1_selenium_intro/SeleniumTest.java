package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.chromedriver().create();

        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //Thread.sleep(5000);

        // navigate to web page
        driver.get("https://www.google.com");
        // driver.navigate().to("https://www.google.com");

        // maximize
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        // driver.get("https://www.etsy.com");
        driver.navigate().to("https://www.etsy.com");

        // navigate back
        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println("Current url is " + driver.getCurrentUrl());
        System.out.println("Title of the website is: " + driver.getTitle());

        driver.findElement(By.id("search-query")).click();
        driver.findElement(By.id("search-query")).sendKeys("toys for newborn babies");


        driver.findElement(By.id("search-query")).clear();


        //driver.quit();
        Thread.sleep(10000);
        //driver.close();

    }
}
