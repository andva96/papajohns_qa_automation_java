package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageBase {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    TouchActions touch;

    public PageBase(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void waitUntilVisibilityOfElement(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementIsSelected(WebElement element) {

        wait.until(ExpectedConditions.elementToBeSelected(element));
    }

    public void waitUntilElementIsClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementAreNotDisplayed(List<WebElement> element) {

        wait.until(ExpectedConditions.invisibilityOfAllElements(element));
    }

    public void clickOnElement(WebElement element) {

        waitUntilVisibilityOfElement(element);
        element.click();
    }

    public void mouseHover(WebElement element) {

        action.moveToElement(element).build().perform();

    }


}
