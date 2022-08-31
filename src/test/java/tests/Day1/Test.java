package tests.Day1;

import org.openqa.selenium.WebDriver;
import tests.Utilities.WebDriverFactory;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        //update the code to use the WebDriverFactory class
    }
}
