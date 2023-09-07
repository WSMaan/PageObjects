import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    private WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.firefox.driver", "\"C:\\Users\\Maan9\\Downloads\\FirefoxInstaller.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 0)
    void loginTest() {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.submit();
        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}

