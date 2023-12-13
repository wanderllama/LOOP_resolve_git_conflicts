package com.loop.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    /**
     *
     */
    String browserType;

    public static WebDriver getDriver(String browserType){
       if (browserType.equalsIgnoreCase("chrome"))
            return WebDriverManager.chromedriver().create();
       else if (browserType.equalsIgnoreCase("edge"))
            return WebDriverManager.edgedriver().create();
       else if (browserType.equalsIgnoreCase("firefox"))
           return WebDriverManager.firefoxdriver().create();
       else if (browserType.equalsIgnoreCase("opera"))
           return WebDriverManager.operadriver().create();
       else if (browserType.equalsIgnoreCase("safari"))
           return WebDriverManager.safaridriver().create();
       else {
           System.out.println("No Driver found.\nDriver is null");
           return null;
       }

    }
}
