package com.parabank.app.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver dirver) {
        this.driver = driver;
    }

    public <TPage> TPage getPageObject(Class<TPage> pageClass) {
        try {
            return PageFactory.initElements(driver, pageClass);
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    } 
}