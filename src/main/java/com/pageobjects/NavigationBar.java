package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NavigationBar extends PageBase {

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Favoritas']")
    private WebElement favoritePizzasOption;

    public FavoritePizzaOptions goToFavoritePizzaSection() {

        waitUntilVisibilityOfElement(favoritePizzasOption);
        mouseHover(favoritePizzasOption);
        favoritePizzasOption.click();
        return new FavoritePizzaOptions(driver);
    }


}
