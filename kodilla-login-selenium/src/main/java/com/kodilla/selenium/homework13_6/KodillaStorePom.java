package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class KodillaStorePom extends AbstractPom {

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String query) {
        WebElement searchField = driver.findElement(By.name("search"));
        searchField.clear();
        searchField.sendKeys(query);
        searchField.submit();
    }

    public int getResultsCount() {
        List<WebElement> results = elements();
        return results.size();
    }

    public List<SearchResult> getSearchResults(){
        int number = getResultsCount();
        List<SearchResult> searchResults = new ArrayList<>();

        for(int i = 0; i < number; i++){
            searchResults.add(new SearchResult());
        }
        for(int i = 0; i<number ; i++){
            searchResults.get(i).setName(driver.findElements(By.tagName("h3")).get(i).getText());
            searchResults.get(i).setImgUrl(driver.findElements(By.tagName("img")).get(i).getAttribute("src"));
            searchResults.get(i).setProcesor(driver.findElements(By.className("description")).get(i).getText());
        }

        return searchResults;
    }

    public List<WebElement> elements(){
        return driver.findElements(By.cssSelector("div[class='element']"));
    }
}
