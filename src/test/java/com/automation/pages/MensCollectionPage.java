package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MensCollectionPage extends BasePage {

    @FindBy(xpath = "//ul[@class=\"header__linklist list--unstyled \"]/li[1]/a")
    WebElement selectNewArrivals;

    @FindBy(xpath = "//h1[text()='MENS NEW ARRIVALS']")
    WebElement newArrivalsTxt;

    @FindBy(xpath = "//div[@class='product-list__inner']/product-item[1]/div/a")
    WebElement item1Jeans;

    @FindBy(xpath = "//div[@class='container']/nav/ol/li[2]/span")
    WebElement jeanPantTxt;

    @FindBy(id = "AddToCart")
    WebElement addToCartBtn;


    public void clicksOnNewArrivals(){
        selectNewArrivals.click();
    }

    public String newArrivalsJeansPage(){
        return newArrivalsTxt.getText();
    }

    public void clicksOnItem1Jeans(){
        item1Jeans.click();
    }

    public Boolean verifyJeansPantPageDisplayed(){
        return addToCartBtn.isDisplayed();
    }

    public void clickOnAddToCart(){
        addToCartBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//cart-drawer[@id='mini-cart']/header/button")));
        button.click();

    }

}
