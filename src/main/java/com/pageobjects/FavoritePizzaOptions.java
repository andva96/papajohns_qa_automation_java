package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FavoritePizzaOptions extends PageBase {

    public FavoritePizzaOptions(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@title='CARNES']")
    private WebElement meetOption;

    public SelectSizeAndCrust selectMeetOption() {

        waitUntilVisibilityOfElement(meetOption);
        meetOption.click();
        return new SelectSizeAndCrust(driver);
    }


}
