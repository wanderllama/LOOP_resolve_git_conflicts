package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.LoopCampConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute{

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://loopcamp.vercel.app/registration_form.html");


        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();
        System.out.println((actualHeaderForForm.equalsIgnoreCase(LoopCampConstants.EXPECTED_HEADER_FOR_FORM))? "TEST PASSED: Header for form is " +
                "Correct" : "TEST FAILED: Header for form is InCorrect");

        WebElement userNamePlaceHolder = driver.findElement(By.name("username"));
        String actualPlaceHolderForUsername = userNamePlaceHolder.getAttribute("placeholder");
        System.out.println((actualPlaceHolderForUsername.equalsIgnoreCase(LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME))?
                "TEST PASSED: Actual placeholder name for USERNAME is Correct" : "TEST FAILED: Header for form is InCorrect");




    }

}
