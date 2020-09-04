package endtoend;

import com.pageobjects.SelectSizeAndCrust;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCrustOptions extends TestBase {

    @Test(testName = "Validate an additional option to add cheese border appears when selecting traditional crust")
    public void validateCheeseBorderOptionOnTraditionalCrust() {

        SelectSizeAndCrust selectPizzaOptions = navigation.goToFavoritePizzaSection().selectMeetOption();
        selectPizzaOptions.selectFamiliarPizza();
        selectPizzaOptions.selectCrustType();
        Assert.assertTrue(selectPizzaOptions.isCheeseBorderAvailable(), "Cheese Border option is not displayed");

    }


}
