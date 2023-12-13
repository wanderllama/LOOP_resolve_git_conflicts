package com.loop.test.youTube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class class_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Automation step by step");


        Thread.sleep(3000);

        driver.close();



    }
}
