package com.test.mvntest.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement userLogin = driver.findElement(By.name("USER_LOGIN"));
        userLogin.sendKeys("incorrect");

        WebElement userPass = driver.findElement(By.name("USER_PASSWORD"));
        userPass.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        String actualErrorText = driver.findElement(By.className("errortext")).getText();
        String expectedErrorText = "Incorrect login or password";
        //System.out.println(actualErrorText);
        if (actualErrorText.equals(expectedErrorText)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.close();
    }

}

//TC #1: NextBaseCRM, locators and getText() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Enter incorrect username: “incorrect”
//4- Enter incorrect password: “incorrect”
//5- Click to login button.
//6- Verify error message text is as expected:
//Expected: Incorrect login or password

//PS: Inspect and decide which locator you should be using to locate web
//elements.
