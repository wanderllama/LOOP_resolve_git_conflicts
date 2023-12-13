package com.loop.test.day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.DocuportConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_TestNG_with_Selenium {

    WebDriver driver;
    String expected;
    String actual;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverManager.chromiumdriver().create();
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test (priority = 1)
    public void googleTitle(){
        driver.get("https://www.google.com");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
        actual = driver.getTitle();
        Assert.assertEquals(expected, actual, "Actual: " + actual + " does not match expected: " + expected);
    }

    @Test (priority = 2)
    public void docuportTitle(){
        driver.get("https://beta.docuport.app/");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Docuport";
        actual = driver.getTitle();
        Assert.assertTrue(actual.contains(expected), "Actual does not match expected");
    }



















}
