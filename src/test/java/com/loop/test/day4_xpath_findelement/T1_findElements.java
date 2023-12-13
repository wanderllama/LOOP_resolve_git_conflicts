package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class T1_findElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.nba.com/");

        ArrayList<WebElement> nbaLinks = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
        System.out.println(nbaLinks.size());

        List<WebElement> nbaLinkXpath = driver.findElements(By.xpath("//a"));
        System.out.println(nbaLinkXpath.size());

        for (WebElement nbaLink : nbaLinks) {
            if (!nbaLink.getText().equals("")) {
                System.out.println("nbaLink = " + nbaLink.getText());
                System.out.println("nbaLink = " + nbaLink.getAttribute("href"));
            }
        }


        /*

     */



    }
}
