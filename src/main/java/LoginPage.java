import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.xpath("//input[@id='username']"))
                .sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys(password);
    }

    public void submit() {
        driver.findElement(By.xpath("//button[@id='submit']"))
                .click();
    }

}
