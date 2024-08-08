package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainTest extends BaseTest {

    @Test(priority = 1)
    public void verifyItemIsAddedIntoCart(){
        home.openWebsite();
        Assert.assertTrue(home.isHomePageDisplayed(), "Homepage is not loading properly");
        home.clickOnDoLaterButton();
        home.userSelectMens();
        home.clickOnDoLaterButton();
        mens.clicksOnNewArrivals();
        home.clickOnDoLaterButton();
        Assert.assertEquals("MENS NEW ARRIVALS", mens.newArrivalsJeansPage());
        mens.clicksOnItem1Jeans();
        home.clickOnDoLaterButton();
        Assert.assertTrue(mens.verifyJeansPantPageDisplayed());
        mens.clickOnAddToCart();
        Assert.assertEquals("1 ITEM", cart.verifyItemIsAddedToCart());
    }

    @Test(priority = 2)
    public void verifyItemIsAddedIntoCartToTakeScreenShot(){
        home.openWebsite();
        Assert.assertTrue(home.isHomePageDisplayed(), "Homepage is not loading properly");
        home.clickOnDoLaterButton();
        home.userSelectMens();
        home.clickOnDoLaterButton();
        mens.clicksOnNewArrivals();
        home.clickOnDoLaterButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Monday Blues Men Jeans ",mens.newArrivalsJeansPage());
        mens.clicksOnItem1Jeans();
        home.clickOnDoLaterButton();
        Assert.assertEquals("Men’s Light Blue Straight Fit Jeans with Knee Rips",
                mens.verifyJeansPantPageDisplayed());
        mens.clickOnAddToCart();
        Assert.assertEquals("1 ITEM", cart.verifyItemIsAddedToCart());
    }
}
