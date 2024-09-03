package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPom {
    protected WebDriver driver;

    public AbstractPom(WebDriver driver) {
        this.driver = driver;
    }
}