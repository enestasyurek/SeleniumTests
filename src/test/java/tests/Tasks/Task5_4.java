package tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_4 {
    WebDriver driver;
    //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
    //default values
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    //3. Verify “Simple dropdown” default selected value is correct
    //Expected: “Please select an option”
    //4. Verify “State selection” default selected value is correct
    //Expected: “Select a State”
    @Test
    public void test(){
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String simpleDropdownText = simpleDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(simpleDropdownText, "Please select an option");
    }

    @Test
    public void test2(){
        Select stateDropdown = new Select(driver.findElement(By.id("state")));
        String stateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(stateDropdownText, "Select a State");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }



}
