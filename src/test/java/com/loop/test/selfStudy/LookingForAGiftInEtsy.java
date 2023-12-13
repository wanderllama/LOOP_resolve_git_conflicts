package com.loop.test.selfStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LookingForAGiftInEtsy {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // navigate to web page
        driver.get("https://www.etsy.com");

        System.out.println("Current url is " + driver.getCurrentUrl());
        System.out.println("Title of the website is: " + driver.getTitle());

        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("toys for newborn babies");
        searchField.submit();

        driver.findElement(By.xpath("a rel")).sendKeys("price_desc");

//        String option = "price_desc";
//        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
//        dropdown.click();


        Thread.sleep(10000);
        //driver.close();

    }
}

