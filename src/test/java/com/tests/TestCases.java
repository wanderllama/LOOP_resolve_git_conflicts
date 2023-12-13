package com.tests;

import com.utility.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestCases {

    @Test
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
}
