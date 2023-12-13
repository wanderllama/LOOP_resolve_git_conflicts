package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.LoopCampConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/login");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        //By.cssSelector("input[name = 'login']"))
        String docuport = logo.getAttribute("alt");
        System.out.println(docuport);
        System.out.println((docuport.equalsIgnoreCase(DocuportConstants.LOGO_DOCUPORT))? "TEST PASSED" : "TEST FAILED");


    }
}
