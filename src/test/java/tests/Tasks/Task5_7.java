package tests.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.Utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task5_7 {
    WebDriver driver;
    //TC #7: Selecting value from non-select dropdown
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    //3. Click to non-select dropdown
    //4. Select Facebook from dropdown
    //5. Verify title is “Facebook - Log In or Sign Up”
    @Test
    public void test(){
        WebElement dropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//a[.='Facebook']"));
        option.click();
        Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
    }



}
