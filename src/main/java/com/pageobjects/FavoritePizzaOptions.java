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

    public PersonalizePizzaOptions selectPizzaType(String type) {

        if (type.equalsIgnoreCase("meet")) {
            System.out.println("option selected: " + type);
            clickOnElement(meetOption);
        }
        return new PersonalizePizzaOptions(driver);
    }


}
