package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
    googleSearch();


    }
    public static void googleSearch() throws InterruptedException {
        System.getProperty("webdriver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation step by Step");

        //click on search button
        driver.findElement(By.name("btnK")).submit();

        Thread.sleep(5000);
        driver.close();
        System.out.println("Test Completed Successfully");

        driver.quit();


    }
}
