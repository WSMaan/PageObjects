import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
    HomePage homePage;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.firefox.driver", "\"C:\\Users\\Maan9\\Downloads\\FirefoxInstaller.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    void selectCourses() {
        homePage.courses();
        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/courses/");
    }

    @Test(priority = 2)
    void freeTrial() {
        homePage.blog();
        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/blog/");
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
