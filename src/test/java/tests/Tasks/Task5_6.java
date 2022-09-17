package tests.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.Utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task5_6 {
    //TC #6: Selecting date on dropdown and verifying
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    //3. Select “December 1st, 1923” and verify it is selected.
    //Select year using  : visible text
    //Select month using   : value attribute
    //Select day using : index number
    @Test
    public void test()  {
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        yearDropdown.selectByVisibleText("1923");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);
        Assert.assertEquals(yearDropdown.getFirstSelectedOption().getText(), "1923");
        Assert.assertEquals(monthDropdown.getFirstSelectedOption().getText(), "December");
        Assert.assertEquals(dayDropdown.getFirstSelectedOption().getText(), "1");

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
