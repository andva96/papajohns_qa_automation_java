package endtoend;


import com.pageobjects.SelectSizeAndCrust;
import org.testng.annotations.Test;

public class TestCheckoutCart extends TestBase {

    @Test(testName = "Validate if the correct product information is displayed on the checkout cart after selecting a crust and an additional topping")
    public void validateProductInformationOnCart() {

        SelectSizeAndCrust selectPizzaOptions = navigation.goToFavoritePizzaSection().selectMeetOption();
        selectPizzaOptions.selectFamiliarPizza();
        selectPizzaOptions.selectCrustType();
        selectPizzaOptions.selectToppings();



    }


}
