package endtoend;


import com.pageobjects.PersonalizePizzaOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTotalPrices extends TestBase {

    @Test(testName = "Validate if the correct total price is displayed on Pizza options section when adding chicken as a additional topping")
    public void validateTotalPriceOnPizzaOptions() {

        PersonalizePizzaOptions selectPizzaOptions = navigation.goToFavoritePizzaSection().selectPizzaType("meet");
        selectPizzaOptions.selectPizzaSize("familiar");
        selectPizzaOptions.selectCrustType("traditional");
        selectPizzaOptions.selectToppings().addTopping("chicken");
        Assert.assertEquals(selectPizzaOptions.getTotalPrice(),"$51.600","The expected price doesn't match");

    }


}
