import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    String BASEURL = "https://beta.warrenroman.com/project-rocket-raccoon/home";

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASEURL);
        homePage = new HomePage(driver);
    }

}
