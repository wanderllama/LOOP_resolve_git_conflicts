package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T0_forget_password {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/login");

        driver.findElement(By.cssSelector("a[href='/reset-password']")).click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println("Forget Password Heading = " + forgetPasswordHeading);
        System.out.println(forgetPasswordHeading.getAttribute("href"));




    }
}
