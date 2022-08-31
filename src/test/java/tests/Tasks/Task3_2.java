package com.test.mvntest.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        String labelText = driver.findElement(By.className("login-item-checkbox-label")).getText();
        if (labelText.equals("Remember me on this computer")){
            System.out.println("Task1 passed");
        }else {
            System.out.println("Task1 failed");
        }

        WebElement forgotPass = driver.findElement(By.className("login-link-forgot-pass"));
        String forgotPassText = forgotPass.getText();

        if (forgotPassText.equals("Forgot your password?")){
            System.out.println("Task2 passed");
        }else {
            System.out.println("Task2 failed");
        }

        String hrefText = forgotPass.getAttribute("href");
        if (hrefText.contains("forgot_password=yes")){
            System.out.println("Task3 passed");
        }else {
            System.out.println("Task3 failed");
        }

        System.out.println("hrefText = " + hrefText);
        System.out.println("forgotPassText = " + forgotPassText);
        System.out.println("labelText = " + labelText);



    }

}
//TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Verify “remember me” label text is as expected:
//Expected: Remember me on this computer
//4- Verify “forgot password” link text is as expected:
//Expected: Forgot your password?
//5- Verify “forgot password” href attribute’s value contains expected:
//Expected: forgot_password=yes
//
//PS: Inspect and decide which locator you should be using to locate web
//elements.