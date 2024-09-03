package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");

        KodillaStorePom storePom = new KodillaStorePom(driver);

        String[] queries = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};
        int[] expectedResults = {5, 3, 2, 4, 6, 1}; // Przykładowe oczekiwane liczby wyników dla każdej frazy

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            int expectedCount = expectedResults[i];

            storePom.search(query);
            int actualCount = storePom.getResultsCount();

            System.out.println("Wyniki wyszukiwania dla '" + query + "': " + actualCount + " (oczekiwane: " + expectedCount + ")");
        }

        driver.close();
    }
}