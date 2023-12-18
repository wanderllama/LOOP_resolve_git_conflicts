package com.loop.utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    private static String url;

    public static String getUrl() {
        return url;
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("-------- Scenario Start --------");
        Driver.setDriver("chrome");
    }

    @BeforeMethod(onlyForGroups = "group1")
    public void setup1() {
        Driver.getDriver().get(Url.GOOGLE.getUrl());
        System.out.println("group1 using google URL");
    }

    @BeforeMethod(onlyForGroups = "group2")
    public void setup2() {
        Driver.getDriver().get(Url.DOCUPORT.getUrl());
        System.out.println("group2 using docuport url");
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        Driver.closeDriver();
    }

}
