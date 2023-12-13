package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));

        WebElement aboutLink = driver.findElement(By.linkText("Google Haqqında"));

        searchBoxWithID.sendKeys("LoopCamp shupel academy");

        searchBoxWithID.clear();
        searchBoxWithID.sendKeys("Loop academy" + Keys.ENTER);

        //searchBoxWithID.submit();

        System.out.println(driver.getCurrentUrl().contains("Loop")? "Actual URL contains \"LOOP\" in it -- PASSED" : "Current URL does not " +
                    "match -- FAILED");

        System.out.println(driver.getTitle().contains("Loop academy - Google'da axtarış")? "Actual Title contains \"LOOP\" in it -- PASSED" :
                "Current Title does not " +
                "match -- FAILED");


        Thread.sleep(13000);
        //driver.quit();




    }
}
