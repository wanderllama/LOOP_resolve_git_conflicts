package com.loop.test.day6_alerts_frames;

import com.loop.test.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class T1_alerts extends TestBase {

//    @Test
//    public void informationAlert() {
//        driver.get("https://loopcamp.vercel.app/dropdown.html");
//        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
//        dropdown.selectByIndex(1);
//        Assert.assertTrue(dropdown.isMultiple());
//    }

    @Test
    public void promptAlert() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickPrompt.click();
        String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys(text);
//        driver.switchTo().alert().accept();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

        Thread.sleep(3000);

        WebElement successMessagePromptAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessagePromptAlert.getText();
        String expected = "You entered: " + text;
        assertEquals(actual, expected, "actual does not match the expected");

    }

}
