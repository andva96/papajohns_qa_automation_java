package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SelectSizeAndCrust extends PageBase {

    public SelectSizeAndCrust(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-value='Familiar']")
    private WebElement familiarPizzaOption;

    @FindBy(xpath = "//input[@id='normal']")
    private WebElement traditionalCrustOption;

    @FindBy(xpath = "//input[@id='thin']")
    private WebElement thinCrustOption;

    @FindBy(xpath = "//a[@title='Modificar ingredientes']")
    private WebElement addToppingsLink;

    @FindBy(xpath = "//div[@class='cheese_border small-12 columns']")
    private WebElement cheeseBorderSquare;


    public void selectFamiliarPizza() {

        waitUntilVisibilityOfElement(familiarPizzaOption);
        familiarPizzaOption.click();
    }

    public void selectCrustType() {

        waitUntilVisibilityOfElement(traditionalCrustOption);
        traditionalCrustOption.click();
    }

    public SelectToppings selectToppings() {

        waitUntilVisibilityOfElement(addToppingsLink);
        addToppingsLink.click();
        return new SelectToppings(driver);
    }

    public boolean isCheeseBorderAvailable() {

        waitUntilVisibilityOfElement(cheeseBorderSquare);
        boolean status = cheeseBorderSquare.isDisplayed();

        if (status){
            System.out.println("Cheese border option is displayed");
        }
        return status;
    }

}
