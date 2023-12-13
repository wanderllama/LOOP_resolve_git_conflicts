package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/login");

        driver.findElement(By.xpath("//a[@href='/reset-password']")).click();
        String actualURLForResetPAssword = driver.getCurrentUrl();

        if (actualURLForResetPAssword.contains(DocuportConstants.RESET_PASSWORD_URL))
            System.out.println("TEST PASSED: Actual url matches the expected URL");
        else
            System.out.println("TEST FAILED: Actual url does not match the expected URL");


        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMessage = validateMessage.getText();

        if (actualValidateMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE))
            System.out.println("TEST PASSED: Actual message of \"Enter your email bla bla\" matches the expected message");
        else
            System.out.println("TEST FAILED: Actual message of \"Enter your email bla bla\" matches the expected message");

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,input)]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space()='Cancel']"));

        if (cancelButton.isDisplayed())
            System.out.println("TEST PASSED: Cancel button is displayed");
        else
            System.out.println("TEST FAILED: Cancel button is not displayed");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

        WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space()='Send']"));

        if (sendButton.isDisplayed())
            System.out.println("TEST PASSED: Send button is displayed");
        else
            System.out.println("TEST FAILED: Send button is not displayed");

        sendButton.click();


        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(2000);

        try {
            System.out.println(successMessage.getText());
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not there anymore");
            //e.printStackTrace();
        }

    }



}
