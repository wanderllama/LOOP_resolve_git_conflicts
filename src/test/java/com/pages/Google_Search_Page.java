package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Search_Page {

    public static WebElement searchBox(WebDriver driver){

        return driver.findElement(By.name("q"));
    }
    public static WebElement button_Search(WebDriver driver){

        return driver.findElement(By.name("btnK"));
    }

}
