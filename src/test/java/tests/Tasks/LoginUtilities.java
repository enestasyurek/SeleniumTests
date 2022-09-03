package com.test.mvntest.tests.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUtilities {
    public static void login(String site ,String userPath,String userMail,String passPath,String userPass){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(site);
        WebElement user = driver.findElement(By.xpath(userPath));
        user.sendKeys(userMail);
        WebElement pass = driver.findElement(By.xpath(passPath));
        pass.sendKeys(userPass);
        driver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).click();
    }


}
