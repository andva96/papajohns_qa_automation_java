package endtoend;


import com.pageobjects.PersonalizePizzaOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTotalPrices extends TestBase {

    @Test(testName = "Validate if the correct total price is displayed on Pizza options section when adding chicken as a additional topping")
    public void validateTotalPriceOnPizzaOptions() {

        PersonalizePizzaOptions pizzaOptions = navigation.goToFavoritePizzaSection().selectPizzaType("meet");
        pizzaOptions.selectPizzaSize("familiar");
        pizzaOptions.selectCrustType("traditional");
        pizzaOptions.selectToppings().addTopping("chicken");
        Assert.assertEquals(pizzaOptions.getTotalPrice(), "$51.600", "The expected price doesn't match");

    }


}
