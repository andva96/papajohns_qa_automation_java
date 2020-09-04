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

        waitUntilElementIsClickable(favoritePizzasOption);
        mouseHover(favoritePizzasOption);
        favoritePizzasOption.click();
        System.out.println("Favorite pizza section selected");
        return new FavoritePizzaOptions(driver);
    }


}
