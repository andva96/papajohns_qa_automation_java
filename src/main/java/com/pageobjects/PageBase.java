package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public PageBase(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }


    public void waitUntilVisibilityOfElement(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void mouseHover(WebElement element){

        action.moveToElement(element).build().perform();
    }


}
