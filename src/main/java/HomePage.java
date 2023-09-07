import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void courses() {
        driver.findElement(By.xpath("//a[normalize-space()='Courses']")).click();

    }

    public void blog(){
        driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();
    }

}
