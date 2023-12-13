package com.loop.test.day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T000_staleElementException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/ ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
        WebElement deleteElement = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println("deleteElement is Displayed? " + deleteElement.isDisplayed());
        deleteElement.click();

        try {
            deleteElement.isDisplayed();
        } catch (StaleElementReferenceException e) {
            System.out.println("Delete element is disappeared");
        }


//        1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
