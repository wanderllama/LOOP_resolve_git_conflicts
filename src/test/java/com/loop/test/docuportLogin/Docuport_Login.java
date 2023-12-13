package com.loop.test.docuportLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Docuport_Login {
    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://beta.docuport.app/login");

        WebElement loginUsername = driver.findElement(By.id("input-14"));
        loginUsername.sendKeys("b1g2_client@gmail.com");
        //loginUsername.submit();

        WebElement loginPassword = driver.findElement(By.id("input-15"));
        loginPassword.sendKeys("Group2");
        loginPassword.submit();




    }
}
