package com.kodilla.selenium.selektoryCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Selektory_CSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome_Driver_x64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        //Jestem na działce gdzie mamy słabe łącze - dlatego takie długie czekanie
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gh-cat")));
        category.sendKeys("Cameras & Photo");
        WebElement inputField = driver.findElement(By.cssSelector("#gh-ac"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".s-item")));
        List<WebElement> items = driver.findElements(By.cssSelector(".s-item"));
        for (WebElement item : items) {
            System.out.println(item.getText());
        }
    }
}