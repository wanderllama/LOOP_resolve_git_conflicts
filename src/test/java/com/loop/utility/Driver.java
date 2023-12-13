package com.loop.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static WebDriver driver;

    private static String b;

    public static void setBrowser(String browser) {
        b = browser.trim().isBlank() ? "" : browser.trim().toLowerCase();
    }

    public static WebDriver getDriver(String browser) {
        setBrowser(browser);
        if (driver == null) {
            b = !b.isBlank() ? b : "chrome";
            System.out.printf("Browser: %s%n", b);
            switch (b) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                default:
                    throw new WebDriverException("%s is an invalid browser".formatted(b));
            }
        }
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            return getDriver("");
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
