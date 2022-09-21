package tests.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.Utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task5_8 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void test(){
        //3. Select all the options from multiple select dropdown.
        //4. Print out all selected values.
        //5. Deselect all values.

        //List<WebElement> options = driver.findElements(By.xpath("//select[@name='Languages']/option"));

            //3. Select all the options from multiple select dropdown.
            Select select = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
            List<WebElement> options = select.getOptions();

            //4. Print out all selected values.
            for (WebElement each : options) {

                each.click();
                System.out.println("Language Options= " + each.getText());

            }

            select.deselectAll();

        }



    }

