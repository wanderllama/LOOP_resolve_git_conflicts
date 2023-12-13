package com.loop.test.day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class T0_RadioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
        //driver.manage().window().maximize();

        //implicit wait in Selenium 3
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //implicit wait in Selenium 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement radioRed = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement radioGreen = driver.findElement(By.xpath("//input[@id='green']"));

        //isSelected
        System.out.println(radioRed.isSelected() + " before clicking radioRed");
        radioRed.click();
        Thread.sleep(5000);
        System.out.println(radioRed.isSelected() + " after clicking radioRed");

        System.out.println("radioRed is Enabled? " + radioRed.isEnabled());
        System.out.println("radioGreen is Enabled? " + radioGreen.isEnabled());




    }
}
