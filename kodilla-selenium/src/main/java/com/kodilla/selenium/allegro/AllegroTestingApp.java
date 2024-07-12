package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome_Driver_x64/chromedriver-win64/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.ebay.com/");
            WebElement category = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
            category.sendKeys("Cameras & Photo");
            WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
            inputField.sendKeys("Mavic mini");
            inputField.submit();
        }
    }