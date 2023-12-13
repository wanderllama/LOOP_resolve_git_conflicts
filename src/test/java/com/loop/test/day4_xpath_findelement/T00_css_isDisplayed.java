package com.loop.test.day4_xpath_findelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_isDisplayed {
    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        WebElement forgotPasswordMessage = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(forgotPasswordMessage.getText());

        if (forgotPasswordMessage.isDisplayed()){
            System.out.println("Forget password heading is displayed");
        } else {
            System.out.println("Forget password heading is not Displayed");
        }

        driver.findElement(By.xpath("//a[@href='/reset-password']"));
        driver.findElement(By.xpath("//a[contains(@href,'/reset=password')]"));
        driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        driver.findElement(By.xpath("//a[contains(text(), 'Forgot')]"));
        driver.findElement(By.xpath("//a[starts-with(@input, 'input')]"));

        driver.findElement(By.xpath("//div[@class='text-right')]"));
        driver.findElement(By.xpath("//div[@class='row']/div[@class='mb-4 col col-12'][1]"));

        /*
        //div[@class='row']/div[@class='mb-4 col col-12'][1]/following-sibling::div[2]
        //div[@class='row']/div[@class='mb-4 col col-12'][1]/following-sibling::div[2]/preceiding-sibling::div
         */



    }
}
