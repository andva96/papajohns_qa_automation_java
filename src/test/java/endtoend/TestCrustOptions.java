package endtoend;


import com.pageobjects.PersonalizePizzaOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCrustOptions extends TestBase {

    @Test(testName = "Validate an additional option to add cheese border appears when selecting traditional crust")
    public void validateCheeseBorderOptionOnTraditionalCrust() {

        PersonalizePizzaOptions pizzaOptions = navigation.goToFavoritePizzaSection().selectPizzaType("meet");
        pizzaOptions.selectPizzaSize("familiar");
        pizzaOptions.selectCrustType("traditional");
        Assert.assertTrue(pizzaOptions.isCheeseBorderAvailable(), "Cheese Border option is not displayed");

    }


}
