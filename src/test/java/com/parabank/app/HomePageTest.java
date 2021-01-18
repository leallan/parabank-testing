package com.parabank.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HomePageTest extends BaseTest {
    @Test
    void canVisitHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        assertEquals(driver.getTitle(), "ParaBank | Welcome | Online Banking");
    }
}