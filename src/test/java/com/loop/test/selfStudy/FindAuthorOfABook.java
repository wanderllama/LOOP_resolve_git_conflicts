package com.loop.test.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

public class FindAuthorOfABook {
    public static void main(String[] args) throws InterruptedException {
        String bookName = getBook();

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Author: " + bookName);
        searchField.submit();

        WebElement authorElement = driver.findElement(By.className("FLP8od"));
        String author = authorElement.getText();
        System.out.println(author);

        Thread.sleep(5000);
        driver.close();
    }
    public static String getBook(){
        System.out.println("What is the name of the book?");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();
        return bookName;
    }
    }

