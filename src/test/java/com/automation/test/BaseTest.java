package com.automation.test;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.MensCollectionPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage home;
    MensCollectionPage mens;
    CartPage cart;


    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
        home = new HomePage();
        mens = new MensCollectionPage();
        cart = new CartPage();
    }
    @AfterMethod
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
