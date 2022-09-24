package tests.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {
    public static void sleep(int seconds){
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //When method is called, it should switch window and verify title.
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains(expectedInUrl) && driver.getTitle().equals(expectedTitle)){
                break;
            }
        }
    }


    //TC #4: Create utility method
    // 1. Create a new method for login
    //2. Create a method to make Task3 logic re-usable
    //3. When method is called, it should simply login
    //
    //This method should have at least 2 overloaded versions.
    //
    //Method #1 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver
    //
    //
    //Method #2 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String username
    //• Arg3: String password

    public static void login_crm(WebDriver driver){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login_crm(WebDriver driver,String username, String password){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    }
}
