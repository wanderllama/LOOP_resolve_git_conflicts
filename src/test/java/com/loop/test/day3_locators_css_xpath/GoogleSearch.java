package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        //System.out.println("The title of the link is correct? " + driver.getTitle().equals("Google"));

        if (actualTitle.contains(expectedTitle))
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", => TEST PASS");
        else
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", => TEST FAIL");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();
        //System.out.println("The title of the link is correct? " + driver.getTitle().equals("Google"));

        if (actualURL.contains(expectedURL))
            System.out.println("Actual title: " + actualURL + ", matches expected title: " + expectedURL + ", => TEST PASS");
        else
            System.err.println("Actual title: " + actualURL + ", DOES NOT match expected title: " + expectedURL + ", => TEST FAIL");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        driver.quit();





    }

}
