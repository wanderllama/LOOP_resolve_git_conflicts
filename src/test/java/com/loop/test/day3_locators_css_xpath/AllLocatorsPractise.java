package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLocatorsPractise {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.clear();
        firstname.sendKeys("Aslan");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.clear();
        lastname.sendKeys("Aslanli");

        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("Isyankar47");

        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("password1998");

        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("aslanli9339@gmail.com");

        WebElement phonenumber = driver.findElement(By.name("phone"));
        phonenumber.clear();
        phonenumber.sendKeys("647-992-3469");

        WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
        gender.click();

        WebElement birthday = driver.findElement(By.xpath("//input[@name='birthday']"));
        birthday.clear();
        birthday.sendKeys("05/20/1993");

        WebElement departmentChoice = driver.findElement(By.name("department"));
        departmentChoice.sendKeys("D");
        departmentChoice.click();

        WebElement titleChoice = driver.findElement(By.name("job_title"));
        titleChoice.sendKeys("S");
        titleChoice.click();

        WebElement chooseJava = driver.findElement(By.xpath("//input[@value='java']"));
        chooseJava.click();

        driver.findElement(By.id("wooden_spoon")).submit();

        WebElement messageFor_Successful_SignUp = driver.findElement(By.id("flash-messages"));
        String actualMessage = messageFor_Successful_SignUp.getText();
        System.out.println(actualMessage.equals("Thanks for signing up!")? "TEST PASSED for a Positive Test Case" : "TEST FAILED for a Positive " +
                "Test Case");

      //  driver.get
 //       System.out.println(driver.findElement(By.linkText("Thanks for signing up!")));
//        System.out.println(output? "Positive TEST CASE PASSED" : "Could NOT SIGN UP - TEST FAILED");












    }
}
