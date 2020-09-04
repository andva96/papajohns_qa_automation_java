package endtoend;

import com.pageobjects.NavigationBar;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    WebDriver driver;
    NavigationBar navigation;

    @BeforeSuite
    public void previousSettings() {

        WebDriverManager.chromedriver().browserVersion("85.0.4183.83").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.papajohns.com.co/");

        navigation = new NavigationBar(driver);
    }


    @AfterSuite
    public void closeDriver() {

        driver.close();

    }


}
