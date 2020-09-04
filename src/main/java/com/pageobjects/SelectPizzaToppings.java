package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectPizzaToppings extends PageBase {

    public SelectPizzaToppings(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='adiciones']/div[@class='medium-6 small-12 columns adicion_ref']/label")
    private List<WebElement> additionalIngredientsList;

    @FindBy(xpath = "//div[@id='adiciones']/div[@class='medium-6 small-12 columns adicion_ref']/input[@id='adicion_1636']")
    private WebElement chickenOption;

    @FindBy(xpath = "//a[@class='btn redbtn add_addittion']")
    private WebElement addToppingButton;


    public PersonalizePizzaOptions addTopping(String topping) {

        if (topping.equalsIgnoreCase("chicken")) {

            clickOnElement(chickenOption);
            waitUntilElementIsSelected(chickenOption);
            System.out.println("Topping selected: " + topping);
            addToppingButton.click();
        }

        waitUntilElementAreNotDisplayed(additionalIngredientsList);
        return new PersonalizePizzaOptions(driver);
    }





}


