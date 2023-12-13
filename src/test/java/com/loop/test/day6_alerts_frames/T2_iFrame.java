package com.loop.test.day6_alerts_frames;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class T2_iFrame extends TestBase {

    @Test
    public void iFrameTest(){
        driver.get("https://loopcamp.vercel.app/iframe.html");

        //by web element
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //driver.switchTo().frame(iframe);

        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //by id or name
        //driver.switchTo().frame("mce_0_ifr");

        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.clear();

        driver.switchTo().defaultContent();
        WebElement poweredBy = driver.findElement(By.xpath("//div[text()='Powered by ']\n"));
        System.out.println("poweredBy.getText() = " + poweredBy.getText());

    }
    @Test
    public void amazonIframe(){
        driver.get("https:amazon.com");
        List<WebElement> iFrames = new ArrayList<>();
        iFrames = driver.findElements(By.xpath("//iframe"));
        System.out.println("iFrames.size() = " + iFrames.size());
    }

}
