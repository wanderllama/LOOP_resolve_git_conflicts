package com.loop.test.day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T5_Multi_DropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void multiSelect() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdown.isMultiple());

        //select by index
//        dropdown.selectByIndex(0);
//        Thread.sleep(3000);
//        dropdown.selectByValue("Saab");
//        Thread.sleep(3000);
//        dropdown.selectByVisibleText("Opel");
//        Thread.sleep(3000);
//        dropdown.selectByIndex(3);

        List<WebElement> options = new ArrayList<>(dropdown.getOptions());

        for (WebElement each : options) {
            each.click();
            System.out.println("each.getText() = " + each.getText());
        }

        options.forEach(each -> {each.getText(); System.out.println("option" + each.getText());});

        dropdown.deselectAll();
        
    }


}
