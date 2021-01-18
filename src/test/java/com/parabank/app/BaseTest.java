package com.parabank.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.lang.reflect.Method;

import com.parabank.app.Utilities.MyLogger;

public class BaseTest {
    protected static WebDriver driver;
    protected WebDriver wait;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterAll
    public static void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
