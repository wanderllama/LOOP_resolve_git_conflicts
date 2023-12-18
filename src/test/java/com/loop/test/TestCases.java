package com.loop.test;


import com.loop.utility.Driver;
import com.loop.utility.Hooks;
import com.loop.utility.SafeData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCases extends Hooks {

    @Test(groups = "group1")
    public void resolveGitConflictMethod() {
        Driver.getDriver().get("https://www.google.com");
        WebElement element =  Driver.getDriver().findElement(By.xpath("(//textarea)[1]"));
        element.sendKeys("automation testing");
        element.sendKeys(Keys.ENTER);

        String expectedTitle = "automation testing - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("expected title is %s, actual title is %s".formatted(expectedTitle, actualTitle), actualTitle, expectedTitle);
        Driver.closeDriver();
    }

    @Test(groups = "group2")
    public void docuportLogin() {
        SafeData safeData = new SafeData();
        Driver.getDriver().get(Hooks.getUrl());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-14")));
        emailInput.sendKeys(safeData.getUsername());
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-15")));
        passwordInput.sendKeys(safeData.getPassword());
        WebElement logOnButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("v-btn__content")));
        logOnButton.click();
        Driver.closeDriver();
    }

}
