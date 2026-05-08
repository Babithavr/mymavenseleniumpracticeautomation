package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        // Chrome options for Jenkins/Linux
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        // Open the website
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Enter username
        driver.findElement(By.id("username")).sendKeys("student");

        Thread.sleep(2000);

        // Enter password
        driver.findElement(By.id("password")).sendKeys("Password123");

        Thread.sleep(2000);

        // Click submit
        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000);

        System.out.println("Login Successful");

        // Close browser
        driver.quit();
    }
}
