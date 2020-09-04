package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PersonalizePizzaOptions extends PageBase {

    public PersonalizePizzaOptions(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='producto_main']")
    private WebElement productSectionSquare;

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

    @FindBy(xpath = "//input[@class='btn redbtn add-to-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='precio_total']")
    private WebElement totalPriceText;


    public void selectPizzaSize(String pizzaSize) {

        waitUntilVisibilityOfElement(productSectionSquare);

        if (pizzaSize.equalsIgnoreCase("familiar")) {
            waitUntilElementIsClickable(familiarPizzaOption);
            mouseHover(familiarPizzaOption);
            familiarPizzaOption.click();
            System.out.println("option selected: " + pizzaSize);
        }

    }

    public void selectCrustType(String crust) {

        if (crust.equalsIgnoreCase("traditional")) {
            clickOnElement(traditionalCrustOption);
            System.out.println("crust selected: " + crust);
        }
    }

    public SelectPizzaToppings selectToppings() {

        clickOnElement(addToppingsLink);
        return new SelectPizzaToppings(driver);
    }

    public boolean isCheeseBorderAvailable() {

        waitUntilVisibilityOfElement(cheeseBorderSquare);
        boolean status = cheeseBorderSquare.isDisplayed();

        if (status) {
            System.out.println("Cheese border option is displayed");
        }
        return status;
    }

    public CheckoutCart addToCart() {

        clickOnElement(addToCartButton);
        return new CheckoutCart(driver);
    }

    public String getTotalPrice() {

        mouseHover(totalPriceText);
        String totalPrice = totalPriceText.getText();
        System.out.println("The total price is: " + totalPrice);
        return totalPrice;
    }

}
