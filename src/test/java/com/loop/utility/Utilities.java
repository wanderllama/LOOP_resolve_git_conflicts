package com.loop.utility;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Utilities extends Driver{

    private void resolveConflictMethod(String a, String b) {

    }

    private static WebDriverWait wait;

    // Create Selenium Objects
    // create WebDriverWait object
    public static void createWait() {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
    }


    // create Actions object
    public static Actions createActions() {
        return new Actions(getDriver());
    }

    // create select object
    public static Select createSelect(WebElement element) {
        return new Select(element);
    }

    // Assert methods
    // title verification
    public static void titleVerification(String expectedTitle) {
        Assert.assertEquals(getDriver().getTitle(), expectedTitle);
    }

    // title verification contains
    public static void titleVerificationContains(String expectedTitle) {
        Assert.assertTrue(getDriver().getTitle().contains(expectedTitle));
    }

    // url verification
    public static void urlVerification(String url) {
        Assert.assertEquals(getDriver().getCurrentUrl(), url);
    }

    // url verification contains
    public void urlVerificationContains(String url) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(url));
    }

    // text verification
    public static void textVerification(WebElement element, String text) {
        Assert.assertEquals(element.getText(), text);
    }

    // text verification contains
    public static void textVerificationContains(WebElement element, String text) {
        Assert.assertTrue(element.getText().contains(text));
    }

    // is displayed verification
    public static void isDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    // is selected verification
    public static void isSelected(WebElement element) {
        Assert.assertTrue(element.isSelected());
    }

    // is enabled verification
    public static void isEnabled(WebElement element) {
        Assert.assertTrue(element.isEnabled());
    }

    // WebDriverWait methods
    // clickable
    public static void isClickable(WebElement element) {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // visible
    public static void waitVisible(WebElement element) {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // select
    public static void waitSelect(WebElement element) {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }

    // alert
    public static void waitAlert() {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.alertIsPresent());
    }

    // url
    public static void waitUrl(String url) {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.urlMatches(url));
    }

    // title is
    public static void waitTitleIs(String title) {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.titleIs(title));
    }

    // title contains
    public static void waitTitleContains(String title) {
        if (wait == null) {
            createWait();
        }
        wait.until(ExpectedConditions.titleContains(title));
    }

    // list of texts from list of WebElements
    public static List<String> getTexts(List<WebElement> elements) {
        List<String> texts = new ArrayList<>();
        for (WebElement element : elements) {
            texts.add(element.getText());
        }
        return texts;
    }
}