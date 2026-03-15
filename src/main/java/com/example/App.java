package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://practicetestautomation.com/practice-test-login/");

        Thread.sleep(2000); // 2 second delay

        // Enter username
        driver.findElement(By.id("username")).sendKeys("student");

        Thread.sleep(2000); // delay

        // Enter password
        driver.findElement(By.id("password")).sendKeys("Password123");

        Thread.sleep(2000); // delay

        // Click submit
        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000); // wait after login
    }
}
