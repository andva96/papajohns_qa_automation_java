package endtoend;

import com.pageobjects.NavigationBar;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    NavigationBar navigation;

    @BeforeSuite
    public void previousSettings() {

        WebDriverManager.chromedriver().browserVersion("83.0.4103.39").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.papajohns.com.co/");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        navigation = new NavigationBar(driver);
    }


    @AfterSuite
    public void closeDriver() {

       // driver.close();

    }


}
