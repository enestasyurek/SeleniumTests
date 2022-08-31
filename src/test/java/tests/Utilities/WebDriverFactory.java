package tests.Utilities;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        if (browserType != null){
            if (browserType.equalsIgnoreCase("chrome")){

                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            }else if (browserType.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }

        }

        return null;
    }

}