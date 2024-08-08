package com.automation.pages;

import com.automation.test.BaseTest;
import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//img[@class='header__logo-image']")
    WebElement freakImage;

    @FindBy(id = "deny")
    WebElement doLaterBtn;

    @FindBy(id = "allow")
    WebElement allowBtn;

    @FindBy(xpath = "//div[@class='category_content_wp']//a[@data-gender='men']")
    WebElement selectMens;

    @FindBy(id = "webpush-onsite")
    WebElement selectIFrame;

    public void openWebsite(){
        driver.get("https://freakins.com/");
    }

    public Boolean isHomePageDisplayed(){
        return freakImage.isDisplayed();
    }

    public void clickOnDoLaterButton(){
        driver.switchTo().frame(selectIFrame);
        doLaterBtn.click();
        driver.switchTo().defaultContent();
    }

    public void clickOnAllowButton(){
        driver.switchTo().frame(selectIFrame);
        allowBtn.click();
        driver.switchTo().defaultContent();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void userSelectMens(){
        selectMens.click();
    }
}
