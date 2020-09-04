package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutCart extends PageBase {

    public CheckoutCart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='carrito_dropdown']/")
    private List<WebElement> cartDropdown;


}
