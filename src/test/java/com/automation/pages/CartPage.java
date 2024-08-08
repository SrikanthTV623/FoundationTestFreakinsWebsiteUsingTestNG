package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{


    @FindBy(xpath = "//p[text()='1 item']")
    WebElement cartCount;

    public String verifyItemIsAddedToCart(){
        return cartCount.getText();
    }
}
