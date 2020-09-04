package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectToppings extends PageBase{

    public SelectToppings(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id='adiciones']")
    private List<WebElement> ingredientsList;


    public void addTopping(){

    }





}


