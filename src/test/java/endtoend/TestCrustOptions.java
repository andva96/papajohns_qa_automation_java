package endtoend;

import com.pageobjects.PersonalizePizzaOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCrustOptions extends TestBase {

    @Test(testName = "Validate an additional option to add cheese border appears when selecting traditional crust")
    public void validateCheeseBorderOptionOnTraditionalCrust() {

        PersonalizePizzaOptions selectPizzaOptions = navigation.goToFavoritePizzaSection().selectPizzaType("meet");
        selectPizzaOptions.selectPizzaSize("familiar");
        selectPizzaOptions.selectCrustType("traditional");
        Assert.assertTrue(selectPizzaOptions.isCheeseBorderAvailable(), "Cheese Border option is not displayed");

    }


}
