package com.parabank.app.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "username") 
    private WebElement userName;

    @FindBy(className = "password")
    private WebElement password;
}